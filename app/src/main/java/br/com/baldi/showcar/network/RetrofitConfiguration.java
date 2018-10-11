package br.com.baldi.showcar.network;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfiguration {

    public static API getApi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")                          //End do Apaary
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create( API.class );
    }

}
