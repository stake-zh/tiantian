package com.stake.shicheng.entity;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created with IntelliJ IDEA.
 * User: starkey
 * Date: 2014/4/2
 * Time: 22:40
 */
public class AccountEntity {
    private volatile static AccountEntity instance;
    public String avatar;
    public int gender;
    public boolean isNews;
    public boolean isPersonal;
    public boolean isPhoto;
    public boolean isRecord;
    public boolean isShare;
    public boolean isWithoutImage;
    public String oauth_token;
    public String oauth_token_secret;
    public String signature;
    public int uid;
    public String username;

    private AccountEntity() {

    }

    public static AccountEntity getInstance() {
        if (instance == null) {
            synchronized (AccountEntity.class) {
                if (instance == null) {
                    instance = new AccountEntity();
                }
            }
        }
        return instance;
    }

    public void load(Context context) {
        SharedPreferences localSharedPreferences = context.getSharedPreferences("login_user_storage", 0);
        this.uid = localSharedPreferences.getInt("uid", 0);
        this.gender = localSharedPreferences.getInt("gender", 0);
        this.username = localSharedPreferences.getString("username", null);
        this.avatar = localSharedPreferences.getString("avatar", null);
        this.signature = localSharedPreferences.getString("signature", null);
        this.oauth_token = localSharedPreferences.getString("oauth_token", null);
        this.oauth_token_secret = localSharedPreferences.getString("oauth_token_secret", null);
        this.isWithoutImage = localSharedPreferences.getBoolean("isWithoutImage", false);
    }

    public void save(Context paramContext) {
        SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("login_user_storage", 0).edit();
        localEditor.putInt("uid", this.uid);
        localEditor.putInt("gender", this.gender);
        localEditor.putString("username", this.username);
        localEditor.putString("avatar", this.avatar);
        localEditor.putString("signature", this.signature);
        localEditor.putString("oauth_token", this.oauth_token);
        localEditor.putString("oauth_token_secret", this.oauth_token_secret);
        localEditor.putBoolean("isWithoutImage", this.isWithoutImage);
        localEditor.commit();
    }

    public boolean isLogin() {
        return (!TextUtils.isEmpty(this.oauth_token)) || (!TextUtils.isEmpty(this.oauth_token_secret));
    }
}
