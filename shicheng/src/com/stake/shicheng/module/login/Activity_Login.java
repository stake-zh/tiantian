package com.stake.shicheng.module.login;

import android.os.Bundle;
import android.widget.EditText;
import com.stake.shicheng.R;
import com.stake.shicheng.base.BaseActivity;

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
    }
}