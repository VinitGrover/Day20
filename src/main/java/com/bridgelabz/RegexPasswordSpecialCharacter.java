package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordSpecialCharacter {
    Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*_-]).{8,}$");

    boolean checkPasswordSpecialCharacter(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
