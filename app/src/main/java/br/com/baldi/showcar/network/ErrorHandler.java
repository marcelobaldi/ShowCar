package br.com.baldi.showcar.network;

import com.google.gson.Gson;

import java.io.IOException;

import br.com.baldi.showcar.dtos.RestResponseDTO;
import retrofit2.HttpException;

public class ErrorHandler {

    public void onError(Throwable error, ErrorHandlerListener listener){
      String errorString = null;
       RestResponseDTO restResponseDTO = null;

        try {
            errorString = ((HttpException) error).response().errorBody().string();


        if(error==null){
            listener.onError( new Exception( "Problema interno na requisição" ) );
        }else {
            restResponseDTO = new Gson().fromJson( errorString, RestResponseDTO.class );
        }

        if(restResponseDTO!=null){
            listener.onFail( restResponseDTO );
        }

        } catch (Exception e) {
           listener.onError( e );
        }
    }

    public interface ErrorHandlerListener{
        public void onError(Throwable e);
        public void onFail(RestResponseDTO restResponseDTO);
    }
}