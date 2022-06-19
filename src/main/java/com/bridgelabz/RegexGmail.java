package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

class RegexGmail {
    Pattern pattern = Pattern.compile("^[a-zA-Z]{3}.?[a-zA-z]{0,3}@[a-zA-Z]{2}.[a-zA-Z]{2}.?[a-zA-Z]{0,2}$");
    boolean checkEmail(String name){
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
