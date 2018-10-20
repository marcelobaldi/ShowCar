package br.com.baldi.showcar.controllers;

import br.com.baldi.showcar.Models.MainModel;
import br.com.baldi.showcar.dtos.LoginResponseDTO;
import br.com.baldi.showcar.fragments.BaseFragment;
import br.com.baldi.showcar.network.RestClient;
import br.com.baldi.showcar.presenters.LoginPresenter;
import br.com.baldi.showcar.requester.RXFactoryRequester;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainController {

    private MainModel mModel;

    public MainController(MainModel model) {
        mModel = model;
    }

    public MainModel getModel() {
        return mModel;
    }

    public void login(final LoginPresenter loginPresenter){

        RestClient client = new RestClient();
        client.login( getModel() )
                .subscribeOn( Schedulers.io() )
                .observeOn( AndroidSchedulers.mainThread() )
                .subscribeWith( new RXFactoryRequester<LoginResponseDTO>() {
                    @Override
                    public void onSuccess(LoginResponseDTO loginResponseDTO) {
                        loginPresenter.onSucess();
                    }

                    @Override
                    public void onFinish() {
                        loginPresenter.onComplete();
                    }
                } );

    }
}