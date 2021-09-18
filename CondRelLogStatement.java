package com.Graham;

import java.util.Scanner;

public class CondRelLogStatement{
    public static void main(String[] args) {
        //conditional statement
        Scanner num = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = num.nextInt();
        num.close();
        if (number % 3== 0){
        System.out.println("fizz");}

    }
}
