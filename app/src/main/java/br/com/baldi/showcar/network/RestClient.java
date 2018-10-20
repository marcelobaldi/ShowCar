package br.com.baldi.showcar.network;
import br.com.baldi.showcar.Models.MainModel;
import br.com.baldi.showcar.dtos.LoginResponseDTO;
import io.reactivex.Observable;

public class RestClient {

    public Observable<LoginResponseDTO> login(MainModel model){
        return RetrofitConfiguration.getApi().login( model.getEmail(), model.getPassword());
    }

}
