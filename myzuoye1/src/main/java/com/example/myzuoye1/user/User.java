package com.example.myzuoye1.user;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Lenovo on 2018/3/6.
 */
@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String conner;
    private String img;
    @Generated(hash = 711361285)
    public User(Long id, String name, String conner, String img) {
        this.id = id;
        this.name = name;
        this.conner = conner;
        this.img = img;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getConner() {
        return this.conner;
    }
    public void setConner(String conner) {
        this.conner = conner;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }

}
