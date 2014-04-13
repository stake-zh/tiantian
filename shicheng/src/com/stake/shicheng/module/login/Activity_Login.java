package com.stake.shicheng.module.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.stake.shicheng.R;
import com.stake.shicheng.base.BaseActivity;
import com.stake.shicheng.module.main.Activity_Main;

/**
 * Created with IntelliJ IDEA.
 * User: starkey
 * Date: 2014/4/5
 * Time: 11:25
 */
public class Activity_Login extends BaseActivity {
    private EditText mEdt_user;
    private EditText mEdt_psw;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Login.this, Activity_Main.class);
                startActivity(intent);
                finish();
            }
        });
    }
}