package com.beiing.mvpdemo;

import mvp.BasePresenter;
import mvp.BaseView;

/**
 * Created by chenliu on 2016/11/3.<br/>
 * 描述：
 * </br>
 */
public class MainContract {

    interface View extends BaseView<Presenter>{
        void loginResult(boolean isLogin);
    }


    interface Presenter extends BasePresenter{
        void login();
    }


}
