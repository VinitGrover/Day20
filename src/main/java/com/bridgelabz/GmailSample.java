package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailSample {
    Pattern pattern = Pattern.compile("^(abc)[.+-]?[0-9]{0,3}(@)[a-z0-9]{1,}.[a-z]{1,}.?[a-z]{1,},?$");

    boolean checkEmail(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
