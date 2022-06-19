package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class RegexPassword {
    Pattern pattern = Pattern.compile("^[0-9a-zA-Z]{8,}$");

    boolean checkPassword(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
