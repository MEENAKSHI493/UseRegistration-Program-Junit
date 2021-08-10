package com.Bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc;

    public static void main(String[] args) {
        System.out.println("Welcome to UserRegistration");
        //Create object
        UserRegistration userRegistration = new UserRegistration();
        /**
         *  userRegistration.validateFirstName();
         *  userRegistration.validateLastName();
         *  userRegistration.validateEmail();
         *  userRegistration.contactNumber();
         *  userRegistration.validatePasswordRule1();
         *  userRegistration.validatePasswordRule2();
         *  userRegistration.validatePasswordRule3();
         **/
        userRegistration.validatePasswordRules();
    }

    //To Validate the user FirstName
    public boolean validateFirstName() {
        //Pattern to check FirstName starts with Caps and has minimum of 3 character (Ex:Meena)
        String regex = "(^[A-Z]+[A-Za-z]{2,})$";
        System.out.println("Please Enter the FirstName:");
        sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("FirstNme valid");
            return true;
        } else {
            System.out.println("FirstName is Invalid");
            return false;
        }
    }

    //To Validate  user LastName
    public boolean validateLastName() {
        //Pattern to check LastName starts with Caps and has minimum of 3 character (Ex:Budarkar)
        String regex = "(^[A-Z]+[A-Za-z]{2,})$";
        System.out.println("Please Enter the LastName:");
        sc = new Scanner(System.in);
        String lastName = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid Lastname:");
            return true;
        } else {
            System.out.println("Invalid LastName:");
            return false;
        }
    }

    //To Validate Email
    public boolean validateEmail() {
        System.out.println("Please Enter the Email:");
        sc = new Scanner(System.in);
        String email = sc.next();
        //Pattern to to check email Ex:abc.xyz@bl.co.in,Invalid:abc.xyz@bl.co%^.in
        boolean result = Pattern.matches("^[a-zA-Z0-9+_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email);
        if (result) {
            System.out.println("Valid mailId");
            return true;
        } else {
            System.out.println("Invalid mailId");
            return false;
        }
    }

    //To Validate contact number
    public boolean contactNumber() {
        System.out.println("Please Enter the contactNumber:");
        sc = new Scanner(System.in);
        String contactNumber = sc.nextLine();
        //Pattern to check country code followed by space and 10 digit number Ex:91 7406998045
        boolean result = Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", contactNumber);
        if (result) {
            System.out.println("Valid contactNumber");
            return true;
        } else {
            System.out.println("InValid contactNumber");
            return result;
        }
    }

    //To Validate password Rule1
    public boolean validatePasswordRule1() {
        System.out.println("Please Enter the  password:");
        sc = new Scanner(System.in);
        String password = sc.nextLine();
        //Pattern to check minimum of 8 characters (ex:abcd*.ef)should fallow password Rules
        boolean result = Pattern.matches(("^[a-zA-Z0-9*._@!&~/.,';$!`~`#]{8,}$"), password);
        if (result) {
            System.out.println("Valid password");
            return true;
        } else {
            System.out.println("InValid password");
            return false;
        }
    }

    //To Validate password Rule2
    public boolean validatePasswordRule2() {
        System.out.println("Please Enter the  password:");
        sc = new Scanner(System.in);
        String password = sc.nextLine();
        //Pattern should have at least 1 Uppercase letter and 8 minimum character(ex:Abec*xyz)
        boolean result = Pattern.matches(("^(?=.*[A-Z])[a-zA-Z0-9*._@!&~/.,';$!`~`#].{8,}$"), password);
        if (result) {
            System.out.println("Valid password");
            return true;
        } else {
            System.out.println("InValid password");
            return false;
        }
    }

    //To Validate password Rule3
    public boolean validatePasswordRule3() {
        System.out.println("Please Enter the  password:");
        sc = new Scanner(System.in);
        String password = sc.nextLine();
        //Pattern should have at least 1 Numeric Number and 8 minimum character(ex:)
        boolean result = Pattern.matches("^(?=.*[0-9])[a-zA-Z0-9*._@!&~/.,';$!`~`#].{8,}$", password);
        if (result) {
            System.out.println("Valid password");
            return true;
        } else {
            System.out.println("InValid password");
            return false;
        }
    }

    //To Validate password Rule4
    public boolean validatePasswordRule4() {
        System.out.println("Please Enter the  password:");
        sc = new Scanner(System.in);
        String password = sc.nextLine();
        //Pattern should have at least 1 Special character  and 8 minimum character(ex:aabc@123)
        boolean result = Pattern.matches(("^(?=.*[@$.%^&*()])[a-zA-Z0-9*._@!&~/.,';$!`~`#].{8,}$"), password);
        if (result) {
            System.out.println("Valid password");
            return true;
        } else {
            System.out.println("InValid password");
            return false;
        }
    }

    //To Validate password Rules
    public boolean validatePasswordRules() {
        System.out.println("Please Enter the  password:");
        sc = new Scanner(System.in);
        String password = sc.nextLine();
        //Pattern to validate all password rules
        boolean result = Pattern.matches(("^(?=.*[@$.%^&*()])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9*._@!&~/.,';$!`~`#]{8,}$"), password);
        if (result) {
            System.out.println("Valid password");
            return true;
        } else {
            System.out.println("InValid password");
            return false;
        }

    }

}



