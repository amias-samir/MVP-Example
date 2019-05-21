package com.example.mvpexample;

public interface LoginView {

    void loginValidationError (String errorMsg);

    void loginSuccess (String successMsg);

    void  loginFailed (String failedMsg);
}
