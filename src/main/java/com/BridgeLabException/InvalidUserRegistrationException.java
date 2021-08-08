package com.BridgeLabException;

    // class representing custom exception
public class InvalidUserRegistrationException extends Exception {
    //constructor
    public InvalidUserRegistrationException(String msg){
        // calling the constructor of parent Exception
        super(msg);
    }
}
