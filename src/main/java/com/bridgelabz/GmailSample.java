package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailSample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(abc)[.+-]?[0-9]{0,3}(@)[a-z0-9]{1,}.[a-z]{1,}.?[a-z]{1,},?$");

        System.out.println("Enter Gmail to verify");
        Scanner userInput = new Scanner(System.in);
        String password = userInput.nextLine();

        Matcher matcher = pattern.matcher(password);

        if (matcher.matches() == false) {
            System.out.println("Invalid Gmail");
        } else {
            System.out.println("Valid Gmail");
        }
    }
}
