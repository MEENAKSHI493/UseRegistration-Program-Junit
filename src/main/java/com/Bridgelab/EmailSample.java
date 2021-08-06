package com.Bridgelab;

import java.util.regex.Pattern;

public class EmailSample {

    //Create  Main  method to validate given EmailSamples
    public static void main(String[] args) {
        //Validate  valid emails given in EmailSamples Should Return True
        String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        //Validate invalid emails in given EmailSamples Should Return False
        String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };
        System.out.println(" Enter Valid email :");
        // Validate valid EmailSamples
        emailValidate(validEmailSample);
        System.out.println("\n Enter Invalid emails :");
        // Validate Invalid EmailSamples
        emailValidate(invalidEmailSample);
    }
    //Create  method to validate EmailSamples  Using Regex
    public static void emailValidate(String[] emails) {
        //String iterative method
        for (String email : emails) {
            System.out.print(Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email) + " ");
        }
    }
}
