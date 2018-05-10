package com.addev.mvpsimpleexample.presenter;

import android.content.Context;

import com.addev.mvpsimpleexample.model.User;
import com.addev.mvpsimpleexample.view.LoginView;

public class LoginPresenter {

    private Context mContext;
    private LoginView mLoginView;

    public LoginPresenter(Context mContext, LoginView mLoginView) {
        this.mContext = mContext;
        this.mLoginView = mLoginView;
    }

    public void login(User user) {
        boolean isLogin = user.login();
        if (isLogin) {
            mLoginView.showLoginStatus("Login Success!!");
        } else {
            mLoginView.showLoginStatus("Login Fail");
        }
    }

}
