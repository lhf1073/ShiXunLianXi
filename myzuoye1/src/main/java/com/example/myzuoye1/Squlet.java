package com.example.myzuoye1;

import android.app.Application;

import app.jiyun.com.testsqlitegd.DaoMaster;
import app.jiyun.com.testsqlitegd.DaoSession;

/**
 * Created by Lenovo on 2018/3/6.
 */

public class Squlet extends Application{
    private static Squlet squlet;
    private DaoSession daoSession;

    public static Squlet getSqulet(){

        return squlet;
    }
    public void onCreate(){
        super.onCreate();
        squlet=this;
       creat();
    }

    private void creat() {
        DaoMaster.DevOpenHelper sjk = new DaoMaster.DevOpenHelper(this, "sjk");
        DaoMaster daoMaster = new DaoMaster(sjk.getWritableDatabase());
        daoSession = daoMaster.newSession();
    }
    public  DaoSession getDaoSession(){

        return daoSession;
    }
}
