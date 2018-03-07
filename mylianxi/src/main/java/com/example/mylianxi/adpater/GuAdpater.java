package com.example.mylianxi.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylianxi.R;
import com.example.mylianxi.student.User;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Lenovo on 2018/3/1.
 */

public class GuAdpater extends RecyclerView.Adapter<GuAdpater.ViewHolder>{

    private List<User.ResultBean.DataBean> data;
    private Context mc;

    public GuAdpater(List<User.ResultBean.DataBean> data, Context mc) {
        this.data = data;
        this.mc = mc;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mc).inflate(R.layout.guitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(mc).load(data.get(position).getThumbnail_pic_s()).into(holder.iv1);
        holder.tv.setText(data.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv1;
        private final TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            iv1 = itemView.findViewById(R.id.iv1);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
