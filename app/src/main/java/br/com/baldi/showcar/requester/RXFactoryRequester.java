package br.com.baldi.showcar.requester;
import br.com.baldi.showcar.dtos.RestResponseDTO;
import br.com.baldi.showcar.network.ErrorHandler;
import io.reactivex.observers.DisposableObserver;

public abstract class RXFactoryRequester<T extends RestResponseDTO> extends DisposableObserver<T>
        implements ErrorHandler.ErrorHandlerListener {
    public abstract void onSuccess(T t);
    public abstract void onFail(RestResponseDTO restResponseDTO);
    public  abstract void onFinish();
    private ErrorHandler errorHandler;

    @Override
    public void onNext(T t) {
        onSuccess( t );
    }

    @Override
    public void onError(Throwable e) {
        errorHandler.onError( e , this);
        onFinish();
    }

    @Override
    public void onComplete() {
        onFinish();
    }


}
