package com.example.myzuoye1.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myzuoye1.R;
import com.example.myzuoye1.Squlet;
import com.example.myzuoye1.user.Student;
import com.example.myzuoye1.user.User;
import com.squareup.picasso.Picasso;

import java.util.List;

import app.jiyun.com.testsqlitegd.UserDao;

/**
 * Created by Lenovo on 2018/3/6.
 */

public class ShouAdpater extends RecyclerView.Adapter<ShouAdpater.ViewHolder> {
    private List<Student.StudentsBean.StudentBean> student1;
    private Context mc;
    private CheckBox cb;
   private UserDao squlet=Squlet.getSqulet().getDaoSession().getUserDao();


    public ShouAdpater(List<Student.StudentsBean.StudentBean> student1, Context mc) {
        this.student1 = student1;
        this.mc = mc;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mc).inflate(R.layout.shouitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        cb = (CheckBox)inflate.findViewById(R.id.cb);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Picasso.with(mc).load(student1.get(position).getImg()).into(holder.tp);
        holder.pj.setText(student1.get(position).getContent());
        holder.name.setText(student1.get(position).getName());

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String img = student1.get(position).getImg();
                String content = student1.get(position).getContent();
                String name = student1.get(position).getName();

                User user = new User();
                user.setImg(img);
                user.setName(name);
                user.setConner(content);

                long insert = squlet.insert(user);

                if (insert>0){
                    Toast.makeText(mc, "成功", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(mc, "不成功", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }


    @Override
    public int getItemCount() {
        return student1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView tp;
        private final TextView pj;
        private final TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            tp = itemView.findViewById(R.id.tp);
            pj = itemView.findViewById(R.id.pj);
            name = itemView.findViewById(R.id.name);

        }
    }
}
