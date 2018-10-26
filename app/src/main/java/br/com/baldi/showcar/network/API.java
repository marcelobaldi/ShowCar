package br.com.baldi.showcar.network;
import br.com.baldi.showcar.dtos.LoginResponseDTO;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {
    @GET("/auth")
    Observable<LoginResponseDTO> login(@Query("email")String email, @Query( "password") String password);
}