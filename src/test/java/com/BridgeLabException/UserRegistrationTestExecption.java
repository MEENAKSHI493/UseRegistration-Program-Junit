package com.BridgeLabException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTestExecption {
    UserRegistrationException useregex = new UserRegistrationException();

    @Test
    public void givenFirstName_whenvalidFirstname_ShouldretrunTrue() throws InvalidUserRegistrationException {
        boolean result = useregex.validateFirstName("Meenakshi");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenlengthlessthan3char_Shouldretrunfalse() throws InvalidUserRegistrationException {
        boolean result = useregex.validateFirstName("Me");
        Assertions.assertFalse(result, String.valueOf(false));
    }

    //Test case to validate lastName
    @Test
    public void givenlastName_whenvalidlastname_ShouldretrunTrue() throws InvalidUserRegistrationException {
        boolean result = useregex.validateLastName("Budarkar");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenHavingSpecialChar_Shouldretrunfalse() throws InvalidUserRegistrationException {
        boolean result = useregex.validateFirstName("Bud@rkar");
        Assert.assertFalse(String.valueOf(false), result);
    }

    //Test case to validate email-id
    @Test
    public void givenEmail_whenvalidEmail_ShouldretrunTrue() throws InvalidUserRegistrationException {
        boolean result = useregex.validateEmail("meena.xyz@bl.co.in.");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotHaveSpecified_Position_Shouldretrunfalse() throws InvalidUserRegistrationException {
        boolean result = useregex.validateFirstName("meena@xys.co");
        Assertions.assertFalse(result, String.valueOf(false));
    }

    //Test case to validate ContactNumber
    @Test
    public void givencontactNumber_whenhavevalidNumber_ShouldretrunTrue() throws InvalidUserRegistrationException {
        boolean result = useregex.contactNumber("91 7408796867");
        Assertions.assertTrue(result);
    }

    @Test
    public void givencontactNumber_whenNothavecountrycodeNumber_Shouldretrunfalse() throws InvalidUserRegistrationException {
        boolean result = useregex.contactNumber("7408796867");
        Assertions.assertFalse(result, String.valueOf(false));
    }

    //Test case to validatePasswordRules
    @Test
    public void givenvalidatePasswordRules_whenSatisfiedAllpasswordrules_ShouldretrunTrue() throws InvalidUserRegistrationException {
        boolean result = useregex.validatePasswordRules("Meen@295fd");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenvalidatePasswordRules_whenHaveminSevenChar_Shouldretrunfalse() throws InvalidUserRegistrationException {
        boolean result = useregex.validatePasswordRules("meen@2");
        Assertions.assertFalse(result, String.valueOf(false));
    }

    @Test
    public void givenvalidatePasswordRules_whenShouldNotHaveCaPS_Shouldretrunfalse() throws InvalidUserRegistrationException {
        boolean result = useregex.validatePasswordRules("meen@2hfh");
        Assertions.assertFalse(result, String.valueOf(false));
    }
}