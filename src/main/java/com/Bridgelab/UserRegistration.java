package com.Bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
       Scanner sc;
        public static void main(String[] args)
        {
            System.out.println("Welcome to UserRegistration");
            //Create object
            UserRegistration userRegistration = new UserRegistration();
            /**
             *  userRegistration.validateFirstName();
             *  userRegistration.validateLastName();
             **/
            userRegistration.validateEmail();
        }
        //To Validate the user FirstName
        public boolean validateFirstName()
        {
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
            String regex =  "(^[A-Z]+[A-Za-z]{2,})$";
            System.out.println("Please Enter the LastName:");
            sc = new Scanner(System.in);
            String lastName = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            boolean result = matcher.matches();
            if (result) {
                System.out.println("Valid Lastname:");
                return true;
            }
            else {
                System.out.println("Invalid LastName:");
                return false;
            }
    }
        //To Validate Email
        public boolean validateEmail(){
            System.out.println("Please Enter the Email:");
            sc = new Scanner(System.in);
            String email = sc.next();
            //Pattern to to check email Ex:abc.xyz@bl.co.in,Invalid:abc.xyz@bl.co%^.in
            boolean result = Pattern.matches("^[a-zA-Z0-9+_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",email);
            if(result) {
                System.out.println("Valid mailId");
                return true;
            }
            else {
                System.out.println("Invalid mailId");
                return false;
            }
        }
}



