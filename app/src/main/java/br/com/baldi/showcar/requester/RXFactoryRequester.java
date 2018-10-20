package br.com.baldi.showcar.requester;

import br.com.baldi.showcar.dtos.RestResponseDTO;
import io.reactivex.observers.DisposableObserver;

public abstract class RXFactoryRequester<T extends RestResponseDTO> extends DisposableObserver<T> {

    public abstract void onSuccess(T t);

    public  abstract void onFinish();

    @Override
    public void onNext(T t) {
        onSuccess( t );
    }

    @Override
    public void onError(Throwable e) {
        onFinish();
    }

    @Override
    public void onComplete() {
        onFinish();
    }
}
