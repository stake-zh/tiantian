package com.stake.shicheng.module.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.stake.shicheng.R;
import com.stake.shicheng.base.BaseActivity;
import com.stake.shicheng.entity.AccountEntity;
import com.stake.shicheng.entity.PrjApplication;

public class Activity_Splash extends BaseActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        AccountEntity  accountEntity = ((PrjApplication)getApplication()).getAccountEntity();
        final Intent intent = new Intent();
        if (accountEntity.isLogin()) {

        } else {
            intent.setClass(this, Activity_Login.class);
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 3000l);
    }
}
