package com.example.mvptut1;

public class LoginPresenter {
    private LoginActivity loginActivity;
    private LoginModel loginModel;

    public LoginPresenter(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        this.loginModel = new LoginModel();
    }

    public void checkLogin(String username, String password){
        boolean result = loginModel.checkLogin(username, password);
        if(result) {
            loginActivity.showResult("Silahkan Masuk " + username + " :)");
        } else {
            loginActivity.showResult("Maaf Anda Bukan Pengguna :(");
        }
    }


}
