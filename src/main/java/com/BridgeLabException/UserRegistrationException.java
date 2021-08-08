package com.BridgeLabException;

import java.util.regex.Pattern;

/*
 * @ throw Exception
 * class to throw custom exception
 */
public class UserRegistrationException {
    public static void main(String[] arg){
        UserRegistrationException obg = new UserRegistrationException();
        obg .validatePasswordRules("fgfjg@hjkh");
    }
    /**
     * @param firstname
     * @return true or false
     * @ throws Exception
     */
    public boolean validateFirstName(String firstname) {
        //Pattern to check LastName starts with Caps and has minimum of 3 character (Ex:Budarkar)
        boolean result = Pattern.matches("[A-Z]+[A-Za-z]{2,}", firstname);
        try {
            if (result) {
                System.out.println(" FirstName:");
                return true;
            } else
                throw new InvalidUserRegistrationException("please enter valid first Name");

        } catch (InvalidUserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * @param lastName
     * @return true or false
     * @ throws Exception
     */
    public boolean validateLastName(String lastName) {
        //Pattern to check LastName starts with Caps and has minimum of 3 character (Ex:Budarkar)
        boolean result = Pattern.matches("(^[A-Z]+[A-Za-z]{2,})$", lastName);
        try {
            if (result) {
                System.out.println("Valid FirstName:");
                return true;
            } else
                throw new InvalidUserRegistrationException("please enter valid lastName");
        } catch (InvalidUserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * @param email
     * @return true or false
     * @ throws Exception
     */
    public boolean validateEmail(String email) {

        //Pattern to to check email Ex:abc.xyz@bl.co.in,Invalid:abc.xyz@bl.co%^.in
        boolean result = Pattern.matches("^[a-zA-Z0-9+_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", email);
        try {
            if (result) {
                System.out.println("Valid EmailId");
                return true;
            } else
                throw new InvalidUserRegistrationException("please enter valid email");
        } catch (InvalidUserRegistrationException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /**
     * @param contactNumber
     * @return true or false
     * @ throws Exception
     */
    public boolean contactNumber(String contactNumber) {
        //Pattern to check country code followed by space and 10 digit number CharSequence contactNum;
        boolean result = Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", contactNumber);
        try {
            if (result) {
                System.out.println("Valid contactNumber");
                return true;
            } else
                throw new InvalidUserRegistrationException("please enter valid contactNumber");
        } catch (InvalidUserRegistrationException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /**
     * @param password
     * @return true or false
     * @ throws Exception
     */

    public boolean validatePasswordRules(String password) {
        //Pattern to validate all password rules
        boolean result = Pattern.matches(("^(?=.*[@$.%^&*()])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9*._@!&~/.,';$!`~`#]{8,}$"), password);
        try {
            if (result) {
                System.out.println("Valid password");
                return true;
            } else
                throw new InvalidUserRegistrationException("please enter valid validatePasswordRules");
        } catch (InvalidUserRegistrationException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}

