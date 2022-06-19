package com.bridgelabz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRegexFirstName {
    static RegexFirstName firstName;

    @BeforeAll
    static void initialise(){
        firstName = new RegexFirstName();
    }

    @Test
    void givenFirstCharacterUpperCase_whenTested_shouldReturnTrue(){
        boolean result = firstName.checkName("Rob");
        assertTrue(result);
    }

}
