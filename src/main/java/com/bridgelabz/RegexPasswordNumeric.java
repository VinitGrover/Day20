package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordNumeric {
    Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");

    boolean checkPasswordNumeric(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
