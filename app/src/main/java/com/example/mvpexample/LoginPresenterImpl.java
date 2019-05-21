package com.example.mvpexample;

import android.text.TextUtils;

public class LoginPresenterImpl implements LoginPresenter {


    LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }


    @Override
    public void handleLogin(String username, String password) {
        if ((TextUtils.isEmpty(username) || TextUtils.isEmpty(password)))
        {

            loginView.loginValidationError("Username or Password is empty");

        }

        else

        {

            if (username.equals("samir") && password.equals("samir"))

            {

                loginView.loginSuccess("Successfully Logged in.");

            }

            else

            {

                loginView.loginFailed("Username and Password is not valid");

            }

        }
    }
}
