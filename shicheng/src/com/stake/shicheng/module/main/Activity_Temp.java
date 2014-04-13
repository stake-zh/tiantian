package com.stake.shicheng.module.main;

import android.os.Bundle;
import com.stake.shicheng.R;
import com.stake.shicheng.base.BaseActivity;

/**
 * Created with IntelliJ IDEA.
 * User: starkey
 * Date: 2014/4/13
 * Time: 22:51
 */
public class Activity_Temp extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}