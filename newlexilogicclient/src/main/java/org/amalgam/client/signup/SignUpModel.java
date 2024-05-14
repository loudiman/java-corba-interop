package org.amalgam.client.signup;

import org.amalgam.UIControllers.PlayerCallback;
import org.amalgam.backend.microservices.client.CreateAccountRequestMicroservice;
import org.amalgam.backend.microservices.serverconnection.ORBConnection;

public class SignUpModel {
    private ORBConnection orbConnection;
    private CreateAccountRequestMicroservice signUpMicroservices;

    public SignUpModel (ORBConnection orbConnection, PlayerCallback playerCallback){
        this.orbConnection = orbConnection;
        this.signUpMicroservices = new CreateAccountRequestMicroservice();
    }

    public void signUp (String username, String password){
        signUpMicroservices.process(orbConnection,username, password);
    }
}
