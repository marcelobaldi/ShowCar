package br.com.baldi.showcar.controllers;

import br.com.baldi.showcar.Models.MainModel;
import br.com.baldi.showcar.presenters.LoginPresenter;

public class MainController {

    private MainModel mModel;

    public MainController(MainModel model) {
        mModel = model;
    }

    public void login(LoginPresenter loginPresenter){
        loginPresenter.onSucess();

    }


}
