package com.Graham;

import java.util.Scanner;

public class JavaMethodsTask22 {
    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            String userInput = "testify";




          while (true) {

                System.out.println("Enter\"testify \"welcome to testify limited");
                userInput = scanner.nextLine();
                if (!userInput.equalsIgnoreCase("testify")) {
                    System.out.println("sorry\"unable to signup\" Enter\"testify");
                    userInput = scanner.nextLine();
                    continue;

               } else if (userInput.equalsIgnoreCase("testify")) {
                   System.out.println("welcome to testify limited");
                    break;

                }


            }
        }


    }