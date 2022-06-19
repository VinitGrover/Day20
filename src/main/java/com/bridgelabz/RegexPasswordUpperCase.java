package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordUpperCase {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        System.out.println("Enter minimum 8 digit Password containing at least one uppercase ");
        Scanner userInput = new Scanner(System.in);
        String password = userInput.nextLine();

        Matcher matcher = pattern.matcher(password);

        if (matcher.matches() == false) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Valid Password");
        }
    }
}
