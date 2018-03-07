package com.example.myzuoye.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myzuoye.R;
import com.example.myzuoye.student.User1;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Lenovo on 2018/3/5.
 */

public class YuAdpater extends RecyclerView.Adapter<YuAdpater.ViewHolder>{
    private List<User1.ResultBean.DataBean> data;
    private Context mc;
    private OnClickListener  onclick;

    public YuAdpater(List<User1.ResultBean.DataBean> data, Context mc) {
        this.data = data;
        this.mc = mc;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mc).inflate(R.layout.sheitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
      if (TextUtils.isEmpty(data.get(position).getThumbnail_pic_s02())&&TextUtils.isEmpty(data.get(position).getThumbnail_pic_s03())){
          Picasso.with(mc).load(data.get(position).getThumbnail_pic_s()).into(holder.img1);

          holder.img2.setVisibility(View.GONE);
          holder.img3.setVisibility(View.GONE);

          holder.tv.setText(data.get(position).getTitle());
      }else if (TextUtils.isEmpty(data.get(position).getThumbnail_pic_s03())){
          Picasso.with(mc).load(data.get(position).getThumbnail_pic_s()).into(holder.img1);
          Picasso.with(mc).load(data.get(position).getThumbnail_pic_s02()).into(holder.img2);

          holder.img3.setVisibility(View.GONE);

          holder.tv.setText(data.get(position).getTitle());
      }else {
          Picasso.with(mc).load(data.get(position).getThumbnail_pic_s()).into(holder.img1);
          Picasso.with(mc).load(data.get(position).getThumbnail_pic_s02()).into(holder.img2);
          Picasso.with(mc).load(data.get(position).getThumbnail_pic_s03()).into(holder.img3);

          holder.tv.setText(data.get(position).getTitle());
      }
      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              onclick.onitemclick(position);
          }
      });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv;
        private final ImageView img1;
        private final ImageView img2;
        private final ImageView img3;

        public ViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
            img1 = itemView.findViewById(R.id.img1);
            img2 = itemView.findViewById(R.id.img2);
            img3 = itemView.findViewById(R.id.img3);

        }
    }
    public interface OnClickListener{
        void onitemclick(int position);
    }
    public void setOnClickListener(OnClickListener  onclick){
        this.onclick=onclick;
    }
}
