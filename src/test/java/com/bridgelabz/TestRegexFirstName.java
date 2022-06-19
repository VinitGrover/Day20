package com.bridgelabz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}
