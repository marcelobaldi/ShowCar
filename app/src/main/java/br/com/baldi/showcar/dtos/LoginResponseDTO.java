package br.com.baldi.showcar.dtos;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoginResponseDTO extends RestResponseDTO implements Serializable {
    //Dados do Web-Service
    //"name":"Marcelo Baldi",
    //"token": "497329479872134KFHSD",
    //"e-mail": "marcelobaldi@hotmail.com"


    @SerializedName( "name" )
    private String nome;
    @SerializedName( "token" )
    private String token;
    @SerializedName( "e-mail" )
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
