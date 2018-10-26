package br.com.baldi.showcar.network;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfiguration {
    public static API getApi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")                          //End do Apaary
                .addConverterFactory(GsonConverterFactory.create())
                .client(interceptor() )
                .build();
        return retrofit.create( API.class );
    }

    public static OkHttpClient interceptor(){
        HttpLoggingInterceptor logging;
        logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        return client;
    }
}
