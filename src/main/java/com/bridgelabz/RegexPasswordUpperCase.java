package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordUpperCase {
    Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).{8,}$");

    boolean checkPasswordUpperCase(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
