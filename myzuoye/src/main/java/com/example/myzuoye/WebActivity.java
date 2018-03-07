package com.example.myzuoye;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

import java.util.Map;

public class WebActivity extends AppCompatActivity {

    private TextView webtv;
    private WebView wv;
    private ImageView tx;
    private TextView wm;
    private Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        initView();
        initData();
        initLineret();
    }

    private void initLineret() {
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UMShareAPI.get(WebActivity.this).getPlatformInfo(WebActivity.this, SHARE_MEDIA.QQ, authListener);
            }
        });


        final UMImage umImage = new UMImage(WebActivity.this, R.mipmap.ic_launcher);
        webtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ShareAction(WebActivity.this)
                        .withText("hello")
                        .withMedia(umImage)
                        .setDisplayList(SHARE_MEDIA.SINA, SHARE_MEDIA.QQ, SHARE_MEDIA.WEIXIN)
                        .setCallback(shareListener)
                        .open();

            }
        });
    }

    private void initData() {
        Intent intent = getIntent();
        final String url = intent.getStringExtra("url");
        String title = intent.getStringExtra("title");
        webtv.setText(title);

        wv.loadUrl(url);
        wv.getSettings().setJavaScriptEnabled(false);
        wv.setWebViewClient(new WebViewClient() {
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                wv.loadUrl(url);
                return super.shouldInterceptRequest(view, request);
            }
        });
    }

    private void initView() {
        webtv = (TextView) findViewById(R.id.webtv);
        wv = (WebView) findViewById(R.id.wv);
        tx = (ImageView) findViewById(R.id.tx);
        wm = (TextView) findViewById(R.id.wm);
        log = (Button) findViewById(R.id.log);
    }

    private UMShareListener shareListener = new UMShareListener() {
        /**
         * @descrption 分享开始的回调
         * @param platform 平台类型
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {

        }

        /**
         * @descrption 分享成功的回调
         * @param platform 平台类型
         */
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Toast.makeText(WebActivity.this, "成功                                     了", Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享失败的回调
         * @param platform 平台类型
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(WebActivity.this, "失                                            败" + t.getMessage(), Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享取消的回调
         * @param platform 平台类型
         */
        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(WebActivity.this, "取消                                     了", Toast.LENGTH_LONG).show();

        }
    };

    UMAuthListener authListener = new UMAuthListener() {
        /**
         * @desc 授权开始的回调
         * @param platform 平台名称
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {

        }

        /**
         * @desc 授权成功的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         * @param data 用户资料返回
         */
        @Override
        public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
            String name = data.get("name");
            String iconurl = data.get("iconurl");

            Picasso.with(WebActivity.this).load(iconurl).into(tx);
            wm.setText(name);
            Toast.makeText(WebActivity.this, "成功了", Toast.LENGTH_LONG).show();

        }

        /**
         * @desc 授权失败的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {

            Toast.makeText(WebActivity.this, "失败：" + t.getMessage(),                                  Toast.LENGTH_LONG).show();
        }

        /**
         * @desc 授权取消的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         */
        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText(WebActivity.this, "取消了", Toast.LENGTH_LONG).show();
        }
    };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(WebActivity.this).onActivityResult(requestCode, resultCode, data);

    }

}
