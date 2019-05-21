package com.example.mvpexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements LoginView {

    LoginPresenter loginPresenter;

    EditText etUserName;
    EditText etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenter = new LoginPresenterImpl(this);
        bindUI();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.handleLogin(etUserName.getText().toString(), etPassword.getText().toString());
            }
        });
    }


    private void bindUI (){
        etUserName = findViewById(R.id.et_user_name);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
    }




    @Override
    public void loginValidationError(String errorMsg) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginSuccess(String successMsg) {
        Toast.makeText(this, successMsg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginFailed(String failedMsg) {
        Toast.makeText(this, failedMsg, Toast.LENGTH_SHORT).show();

    }
}
