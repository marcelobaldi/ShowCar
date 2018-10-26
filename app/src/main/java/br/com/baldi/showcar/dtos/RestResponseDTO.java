package br.com.baldi.showcar.dtos;
import com.google.gson.annotations.SerializedName;

public class RestResponseDTO {

    @SerializedName( "code" )
    private String code;

    @SerializedName( "messsage")            //from apyary
    private String msg;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
