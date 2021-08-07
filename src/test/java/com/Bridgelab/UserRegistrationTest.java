package com.Bridgelab;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //Creating object
    UserRegistrationRegex regexvalidator = new UserRegistrationRegex();

    //Test case to validate firstName
    @Test // @ Annotation
    //Method should return true when satisfied Firstname condition
    public void givenFirstName_whenvalidFirstname_ShouldretrunTrue() {  // calling Method
        boolean result = regexvalidator.validateFirstName("Meeenakshi");
        Assert.assertTrue(result);
    }

    //Test case to validate firstName length
    @Test // @ Annotation
    // Method  return false when not have min 3 char
    public void givenFirstName_whenlengthlessthan3char_Shouldretrunfalse() { // calling Method
        boolean result = regexvalidator.validateFirstName("Me");
        Assert.assertFalse(String.valueOf(false), result);
    }

    //Test case to validate lastName
    @Test  // @ Annotation
    //Method should return true when satisfied lastName condition
    public void givenlastName_whenvalidlastname_ShouldretrunTrue() {              // calling Method
        boolean result = regexvalidator.validateLastName("Budarkar");
        Assert.assertTrue(result);
    }

    //Test case to validate  lastName length
    @Test // @ Annotation
    // Method  return false when not have special char
    public void givenFirstName_whenHavingSpecialChar_Shouldretrunfalse() {           // calling Method
        boolean result = regexvalidator.validateFirstName("Bud@rkar");
        Assert.assertFalse(String.valueOf(false), result);
    }

    //Test case to validate email-id
    @Test // @ Annotation
    // Method should retun true when satisfies email rules
    public void givenEmail_whenvalidEmail_ShouldretrunTrue() {                          // calling Method
        boolean result = regexvalidator.validateEmail("meena.xyz@bl.co.in.");
        Assert.assertTrue(result);
    }

    @Test // @ Annotation
    // Method  return false when not have satisfied Specified position
    public void givenEmail_whenNotHaveSpecified_Position_Shouldretrunfalse() {           // calling Method
        boolean result = regexvalidator.validateFirstName("meena@xys.co");
        Assert.assertFalse(String.valueOf(false), result);
    }

    //Test case to validate ContactNumber
    @Test // @ Annotation
    //  Method should return true when caonact number have country code and min 10 char
    public void givencontactNumber_whenhavevalidNumber_ShouldretrunTrue() {               // calling Method
        boolean result = regexvalidator.contactNumber("91 7408796867");
        Assert.assertTrue(result);
    }

    @Test // @ Annotation
    // Method should return false when contact number not have country code
    public void givencontactNumber_whenNothavecountrycodeNumber_Shouldretrunfalse() {     // calling Method
        boolean result = regexvalidator.contactNumber("7408796867");
        Assert.assertFalse(String.valueOf(false), result);
    }
    //Test case to validatePasswordRules

    @Test // @ Annotation
    //  Method should return true when satisfied all the password Rules
    public void givenvalidatePasswordRules_whenSatisfiedAllpasswordrules_ShouldretrunTrue() {               // calling Method
        boolean result = regexvalidator.validatePasswordRules("Meen@295fd");
        Assert.assertTrue(result);
    }

    @Test // @ Annotation
    //  Method should return false when password have 7 charecter
    public void givenvalidatePasswordRules_whenHaveminSevenChar_Shouldretrunfalse() {     // calling Method
        boolean result = regexvalidator.validatePasswordRules("meen@2");
        Assert.assertFalse(String.valueOf(false), result);
    }

    @Test // @ Annotation
    // Method should return fasle when password shoud not hane aleast one caps
    public void givenvalidatePasswordRules_whenShouldNotHaveCaPS_Shouldretrunfalse() {     // calling Method
        boolean result = regexvalidator.validatePasswordRules("meen@2hfh");
        Assert.assertFalse(String.valueOf(false), result);
    }
}
