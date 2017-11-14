package com.example.testutils;

import android.app.Application;

/**
 * Created by H on 2017/11/6 16:26
 */

public class TestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TUtil.init(this);
    }
}
