package br.com.baldi.showcar.network;
import br.com.baldi.showcar.Models.LoginModel;
import br.com.baldi.showcar.dtos.LoginResponseDTO;
import io.reactivex.Observable;

public class RestClient {

    public Observable<LoginResponseDTO> login(LoginModel loginModel){
        return RetrofitConfiguration.getApi().login( loginModel.getEmail(), loginModel.getPassword());
    }

}
