package com.beiing.mvpdemo;

/**
 * Created by chenliu on 2016/11/3.<br/>
 * 描述：
 * </br>
 */
public class MainPresenter implements MainContract.Presenter {

    MainContract.View mainView;

    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;
    }

    @Override
    public void login() {
        mainView.loginResult(System.currentTimeMillis() % 2 == 0);
    }

}
