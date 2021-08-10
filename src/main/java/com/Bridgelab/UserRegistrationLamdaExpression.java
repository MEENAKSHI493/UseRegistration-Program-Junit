package com.Bridgelab;

import java.util.regex.Pattern;

@FunctionalInterface
   /*
    * @ Annotation
    * @FunctionalInterface is used to declare an interface funtional interface.
    */
interface Validator{
    boolean validator (String pattern ,String msg);
    /**
     * Creating a UserRegisyrationlamdaExpression
     * Main method to validate the string true or false
     */
}
public class UserRegistrationLamdaExpression {
    private static  final String VALIDATE_FIRST_NAME = "(^[A-Z]+[A-Za-z]{2,})$";
    private static  final String VALIDATE_LAST_NAME = "(^[A-Z]+[A-Za-z]{2,})$";
    private static  final String VALIDATE_EMAIL = "^[a-zA-Z0-9+_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private static  final String VALIDATE_CONTACT_NUMBER = "^[0-9]{2}\\s[0-9]{10}$";
    private static  final String VALIDATE_PASSWORD = ("^(?=.*[@$.%^&*()])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9*._@!&~/.,';$!`~`#]{8,}$");

    public  static  void main (String[] args){
        Validator validate =(String pattern, String msg)-> Pattern.matches(pattern,msg);
        System.out.println("FirstName is "+ validate.validator(VALIDATE_FIRST_NAME,"Meenakshi"));
        System.out.println("LastName is "+ validate.validator(VALIDATE_LAST_NAME,"Sabde"));
        System.out.println("Email is "+  validate.validator(VALIDATE_EMAIL,"abc23@gmail.com"));
        System.out.println("contactnumber is "+ validate.validator(VALIDATE_CONTACT_NUMBER,"91 7406996877"));
        System.out.println("Password is "+validate.validator(VALIDATE_PASSWORD,"ytvt34566"));
    }
}

