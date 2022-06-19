package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRegexFirstName {

    @Test
    void givenFirstCharacterUpperCase_whenTested_shouldReturnTrue() {
        RegexFirstName firstName = new RegexFirstName();
        boolean result = firstName.checkName("Rob");
        assertTrue(result);
    }

    @Test
    void givenFirstAndLastCharacterUpperCase_whenTested_shouldReturnTrue() {
        Regex name = new Regex();
        boolean result = name.checkName("Alex Volkonovski");
        assertTrue(result);
    }

    @Test
    void givenEmail_whenTested_shouldFollowConvention(){
        RegexGmail email = new RegexGmail();
        boolean result = email.checkEmail("vin@co.in");
        assertTrue(result);
    }

    @Test
    void givenPhone_WhenTested_shouldReturnTrue(){
        RegexMobile mobile = new RegexMobile();
        boolean result = mobile.checkPhone("91 7804879237");
        assertTrue(result);
    }

    @Test
    void givenPassword_WhenTested_shouldReturnTrue(){
        RegexPassword password = new RegexPassword();
        boolean result = password.checkPassword("HsdjfksJjsjd");
        assertTrue(result);
    }

    @Test
    void givenPasswordHaveAtLeastOneUpperCase_WhenTested_shouldReturnTrue(){
        RegexPasswordUpperCase password = new RegexPasswordUpperCase();
        boolean result = password.checkPasswordUpperCase("HsdjfksJjsjd");
        assertTrue(result);
    }

    @Test
    void givenPasswordHaveAtLeastOneNumeric_WhenTested_shouldReturnTrue(){
        RegexPasswordNumeric password = new RegexPasswordNumeric();
        boolean result = password.checkPasswordNumeric("Hsdjf44ksJjsjd");
        assertTrue(result);
    }

    @Test
    void givenPasswordHaveAtLeastOneSpecialCharacter_WhenTested_shouldReturnTrue(){
        RegexPasswordSpecialCharacter password = new RegexPasswordSpecialCharacter();
        boolean result = password.checkPasswordSpecialCharacter("Hsdjf44ksJ%$jsjd");
        assertTrue(result);
    }

    @Test
    void givenEmail_WhenTested_shouldReturnTrue(){
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
}
