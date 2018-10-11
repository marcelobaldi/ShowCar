package br.com.baldi.showcar.Models;

public class LoginModel {
    //Campos
    private String email;
    private String password;

    //GetterSetter
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    //Construtor
    public LoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
