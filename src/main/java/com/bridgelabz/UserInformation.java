package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {
    Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}\\s[A-Z]{1}[A-Za-z]{2,}$");

    boolean checkName(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    Pattern patternPass = Pattern.compile("^[0-9a-zA-Z]{8,}$");

    boolean checkPassword(String name) {
        Matcher matcher = patternPass.matcher(name);
        return matcher.matches();
    }

    Pattern patternMobile = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");

    boolean checkPhone(String name) {
        Matcher matcher = patternMobile.matcher(name);
        return matcher.matches();
    }

    Pattern patternGmail = Pattern.compile("^[a-zA-Z]{3}.?[a-zA-z]{0,3}@[a-zA-Z]{2}.[a-zA-Z]{2}.?[a-zA-Z]{0,2}$");

    boolean checkEmail(String name) {
        Matcher matcher = patternGmail.matcher(name);
        return matcher.matches();
    }
}
