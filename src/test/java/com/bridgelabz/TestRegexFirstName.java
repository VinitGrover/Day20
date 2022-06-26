package com.bridgelabz;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestRegexFirstName {

    @Test
    public void givenFirstCharacterUpperCase_whenTested_shouldReturnTrue() {
        RegexFirstName firstName = new RegexFirstName();
        boolean result = firstName.checkName("Rob");
        assertTrue(result);
    }

    @Test
    public void givenFirstAndLastCharacterUpperCase_whenTested_shouldReturnTrue() {
        Regex name = new Regex();
        boolean result = name.checkName("Alex Volkonovski");
        assertTrue(result);
    }

    @Test
    public void givenEmail_whenTested_shouldFollowConvention(){
        RegexGmail email = new RegexGmail();
        boolean result = email.checkEmail("vin@co.in");
        assertTrue(result);
    }

    @Test
    public void givenPhone_WhenTested_shouldReturnTrue(){
        RegexMobile mobile = new RegexMobile();
        boolean result = mobile.checkPhone("91 7804879237");
        assertTrue(result);
    }

    @Test
    public void givenPassword_WhenTested_shouldReturnTrue(){
        RegexPassword password = new RegexPassword();
        boolean result = password.checkPassword("HsdjfksJjsjd");
        assertTrue(result);
    }

    @Test
    public void givenPasswordHaveAtLeastOneUpperCase_WhenTested_shouldReturnTrue(){
        RegexPasswordUpperCase password = new RegexPasswordUpperCase();
        boolean result = password.checkPasswordUpperCase("HsdjfksJjsjd");
        assertTrue(result);
    }

    @Test
    public void givenPasswordHaveAtLeastOneNumeric_WhenTested_shouldReturnTrue(){
        RegexPasswordNumeric password = new RegexPasswordNumeric();
        boolean result = password.checkPasswordNumeric("Hsdjf44ksJjsjd");
        assertTrue(result);
    }

    @Test
    public void givenPasswordHaveAtLeastOneSpecialCharacter_WhenTested_shouldReturnTrue(){
        RegexPasswordSpecialCharacter password = new RegexPasswordSpecialCharacter();
        boolean result = password.checkPasswordSpecialCharacter("Hsdjf44ksJ%$jsjd");
        assertTrue(result);
    }

    @Test
    public void givenEmail_WhenTested_shouldReturnTrue(){
        GmailSample email = new GmailSample();
        boolean result = email.checkEmail("abc@yahoo.com");
        assertTrue(result);
        result = email.checkEmail("abc-100@yahoo.com,");
        assertTrue(result);
        result = email.checkEmail("abc.100@yahoo.com");
        assertTrue(result);
        result = email.checkEmail("abc111@abc.com,");
        assertTrue(result);
        result = email.checkEmail("abc-100@yahoo.abc.net,");
        assertTrue(result);
        result = email.checkEmail("abc.100@bc.com.au");
        assertTrue(result);
        result = email.checkEmail("abc@1.com,");
        assertTrue(result);
        result = email.checkEmail("abc@gmail.com.com");
        assertTrue(result);
        result = email.checkEmail("abc+100@gmail.com");
        assertTrue(result);
    }
    @Test
    public void WhenProvidedforUserInfo_andTested_shouldApproveAll(){
        UserInformation user = new UserInformation();
        boolean result = user.checkName("Vinit Grover");
        assertTrue(result);
        result = user.checkPassword("HsdjfksJjsjd");
        assertTrue(result);
        result = user.checkPhone("91 7804879237");
        assertTrue(result);
        result = user.checkEmail("vin@co.in");
        assertTrue(result);
    }


}
