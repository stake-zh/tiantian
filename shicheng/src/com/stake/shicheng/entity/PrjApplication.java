package com.stake.shicheng.entity;

import com.stake.shicheng.base.BaseApplication;

/**
 * Created with IntelliJ IDEA.
 * User: starkey
 * Date: 2014/4/2
 * Time: 21:12
 */
public class PrjApplication extends BaseApplication {
    private AccountEntity accountEntity;

    @Override
    public void onCreate() {
        super.onCreate();
        accountEntity = AccountEntity.getInstance();

    }

    public AccountEntity getAccountEntity() {
        return accountEntity;
    }

    public void setAccountEntity(AccountEntity accountEntity) {
        this.accountEntity = accountEntity;
    }
}

