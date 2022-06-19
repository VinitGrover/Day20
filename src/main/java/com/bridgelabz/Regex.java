package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
        
        System.out.println("Enter First Name");
        Scanner userInput = new Scanner(System.in);
        String firstName = userInput.nextLine();
        
        Matcher matcher = pattern.matcher(firstName);
        
        if (matcher.matches() == false) {
            System.out.println("Entered Name does not follow the convention");
        }

        System.out.println("Enter Last Name");
        String lastName = userInput.nextLine();

        matcher = pattern.matcher(lastName);

        if (matcher.matches() == false) {
            System.out.println("Entered Name does not follow the convention");
        }
    }
}