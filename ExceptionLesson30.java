package com.Graham;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLesson30 {
    public static void main(String[] args) {
        try {

            System.out.println("Enter your age");
            Scanner sc = new Scanner(System.in);
            int twelve = sc.nextInt();
            System.out.println("your age is: " + twelve);
        } catch (InputMismatchException ageException){
            System.out.println("12 is what is needed not morayo");
            System.out.println(ageException);








    }
}
    }
