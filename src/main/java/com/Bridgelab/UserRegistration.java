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
            userRegistration.validateFirstName();
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
    }



