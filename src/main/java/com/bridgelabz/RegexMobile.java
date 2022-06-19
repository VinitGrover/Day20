
package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class RegexMobile {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");

        System.out.println("Enter country code and phone number ");
        Scanner userInput = new Scanner(System.in);
        String phoneNumber = userInput.nextLine();

        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches() == false) {
            System.out.println("Entered phone does not match the convention");
        } else {
            System.out.println("Valid Phone Number");
        }

    }
}
