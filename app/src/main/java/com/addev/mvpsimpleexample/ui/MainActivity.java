package com.addev.mvpsimpleexample.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.addev.mvpsimpleexample.R;
import com.addev.mvpsimpleexample.model.User;
import com.addev.mvpsimpleexample.presenter.LoginPresenter;
import com.addev.mvpsimpleexample.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    private EditText edtUname, edtPwd;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUname = ((EditText) findViewById(R.id.edtUname));
        edtPwd = ((EditText) findViewById(R.id.edtPwd));
        //
        mLoginPresenter = new LoginPresenter(this, this);
        //
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.login(new User(edtUname.getText().toString().trim(),
                        edtPwd.getText().toString().trim()));
            }
        });
    }

    @Override
    public void showLoginStatus(String status) {
        Toast.makeText(this, "" + status, Toast.LENGTH_SHORT).show();
    }
}
