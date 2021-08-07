package com.Bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRegex {

    //To Validate the user FirstName
    public boolean validateFirstName(String firstname)
    {
        //Pattern to check FirstName starts with Caps and has minimum of 3 character (Ex:Meena)
        String regex = "(^[A-Z]+[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstname);
        boolean result = matcher.matches();
        if (result)
            return true;
         else
            return false;
    }
    //To Validate  user LastName
    public boolean validateLastName(String lastName) {
        //Pattern to check LastName starts with Caps and has minimum of 3 character (Ex:Budarkar)
        String regex =  "(^[A-Z]+[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        if (result)
            return true;
        else
            return false;

    }
    //To Validate Email
    public boolean validateEmail(String email){
        //Pattern to to check email Ex:abc.xyz@bl.co.in,Invalid:abc.xyz@bl.co%^.in
        boolean result = Pattern.matches("^[a-zA-Z0-9+_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",email);
        if(result)
            return true;
        else
            return false;
    }

    //To Validate contact number
    public boolean contactNumber(String contactNumber){
        //Pattern to check country code followed by space and 10 digit number Ex:91 7406998045
        boolean result=Pattern.matches("^[0-9]{2}\\s[0-9]{10}$",contactNumber);
        if (result)
            return true;
            else
            return false;
    }
    //To Validate password Rule1
    public boolean validatePasswordRule1(String password){

        //Pattern to check minimum of 8 characters (ex:abcd*.ef)should fallow password Rules
        boolean result=Pattern.matches(("^[a-zA-Z0-9*._@!&~/.,';$!`~`#]{8,}$"),password);
        if (result)
            return true;
        else
            return false;
    }
    //To Validate password Rule2
    public boolean validatePasswordRule2(String password){
        //Pattern should have at least 1 Uppercase letter and 8 minimum character(ex:Abec*xyz)
        boolean result=Pattern.matches(("^(?=.*[A-Z])[a-zA-Z0-9*._@!&~/.,';$!`~`#].{8,}$"),password);
        if (result)
            return true;
        else
            return false;
    }
    //To Validate password Rule3
    public boolean validatePasswordRule3(String password){
        //Pattern should have at least 1 Numeric Number and 8 minimum character(ex:)
        boolean result=Pattern.matches("^(?=.*[0-9])[a-zA-Z0-9*._@!&~/.,';$!`~`#].{8,}$",password);
        if (result)
            return true;
        else
            return false;
    }
    //To Validate password Rule4
    public boolean validatePasswordRule4(String password ){
        //Pattern should have at least 1 Special character  and 8 minimum character(ex:aabc@123)
        boolean result=Pattern.matches(("^(?=.*[@$.%^&*()])[a-zA-Z0-9*._@!&~/.,';$!`~`#].{8,}$"),password);
        if (result)
            return true;
        else
            return false;
    }
    //To Validate validatePasswordRules
    public boolean validatePasswordRules(String password ){
        //Pattern should satisfied all passwordRules
        boolean result=Pattern.matches(("^(?=.*[@$.%^&*()])[a-zA-Z0-9*._@!&~/.,^';$!<>{}.`~`#.{8,}$"),password);
        if (result)
            return true;
        else
            return false;
    }

}
