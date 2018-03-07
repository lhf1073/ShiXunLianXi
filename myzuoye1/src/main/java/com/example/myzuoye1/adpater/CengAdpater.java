package com.example.myzuoye1.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myzuoye1.R;
import com.example.myzuoye1.user.User;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Lenovo on 2018/3/6.
 */

public class CengAdpater extends RecyclerView.Adapter<CengAdpater.ViewHolder>{

    private List<User> users;
    private Context mc;
    private OnClickListener  onclick;
    private OnClickListener longonclick;

    public CengAdpater(List<User> users, Context mc) {
        this.users = users;
        this.mc = mc;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mc).inflate(R.layout.cengitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Picasso.with(mc).load(users.get(position).getImg()).into(holder.cimg);
        holder.ctv.setText(users.get(position).getConner());
        holder.cname.setText(users.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclick.onitemClick(position);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
               longonclick.onitemClick(position);

                return false;
            }
        });
    }


    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView cimg;
        private final TextView ctv;
        private final TextView cname;

        public ViewHolder(View itemView) {
            super(itemView);
            cimg = itemView.findViewById(R.id.ctp);
            ctv = itemView.findViewById(R.id.cpj);
            cname = itemView.findViewById(R.id.cname);
        }
    }
    public interface OnClickListener{
        void onitemClick(int position);
    }
    public void setOnClickListener(OnClickListener  onclick){
        this.onclick=onclick;
    }
    public void setLongOnClick(OnClickListener longonclick){
        this.longonclick=longonclick;
    }
}
