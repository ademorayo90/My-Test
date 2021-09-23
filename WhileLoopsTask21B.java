package com.Graham;

import java.util.Scanner;

public class WhileLoopsTask21B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String UserInput = "Try again";

        while (true) {
            if (!UserInput.equalsIgnoreCase("testify")) {
                System.out.println("Sorry, \"Try Again\" by Typing \"testify");
                UserInput = scanner.nextLine();
                continue;
            } else if (UserInput.equalsIgnoreCase("Testify")) {
                System.out.println("welcome you have entered the correct thing");
                break;

            }
        }
    }
}

