package org.amalgam.client.login;

import org.amalgam.UIControllers.PlayerCallback;
import org.amalgam.backend.microservices.client.LoginMicroservice;
import org.amalgam.backend.microservices.serverconnection.ORBConnection;

public class LoginModel {
    private final ORBConnection orbConnection;
    private final PlayerCallback playerCallback;
    private final LoginMicroservice loginMicroservice;

    public LoginModel (ORBConnection orbConnection, PlayerCallback playerCallback){
        this.orbConnection = orbConnection;
        this.playerCallback = playerCallback;
        this.loginMicroservice = new LoginMicroservice();
    }

    public  void login (String password){
        loginMicroservice.process(orbConnection, playerCallback, password);
    }

}
