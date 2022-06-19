package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class RegexPassword { 

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z]{8,}$");

        System.out.println("Enter minimum 8 digit password ");

        System.out.println("Enter at least 8 digit password ");
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
