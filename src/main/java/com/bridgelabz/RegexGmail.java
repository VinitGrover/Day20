package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

class RegexGmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{3}.?[a-zA-z]{0,3}@[a-zA-Z]{2}.[a-zA-Z]{2}.?[a-zA-Z]{0,2}$");

        System.out.println("Enter Gmail");
        Scanner userInput = new Scanner(System.in);
        String gmail = userInput.nextLine();

        Matcher matcher = pattern.matcher(gmail);

        if (matcher.matches() == false) {
            System.out.println("Entered Gmail does not match the convention");
        } else { 
            System.out.println("invalid Gmail");
        }
    }
}
