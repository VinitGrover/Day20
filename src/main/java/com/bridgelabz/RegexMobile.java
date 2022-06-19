
package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class RegexMobile {
    Pattern pattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");

    boolean checkPhone(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
