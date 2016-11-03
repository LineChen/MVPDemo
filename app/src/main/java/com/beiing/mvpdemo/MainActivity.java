package com.beiing.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
    }

    public void loginClick(View view) {
        presenter.login();
    }

    @Override
    public void loginResult(boolean isLogin) {
        Toast.makeText(MainActivity.this, "登录结果：" + isLogin, Toast.LENGTH_SHORT).show();
    }


}
