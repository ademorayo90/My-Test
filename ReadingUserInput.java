package com.Graham;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
       // Scanner userInput = new Scanner(System.in);
       // System.out.println("welcome, please input your date of birth.");
       // Short dob = userInput.nextShort();
       // Short presentYear = 2021;
       // int CustomerAge = presentYear-dob;
        //
        // System.out.println("You are "+CustomerAge+"years old");
        Scanner myObj =new Scanner(System.in);
        Float principal;
        Float rate;
        Float time;
        Float interest;
        //Enter principal and press Enter
        System.out.println("Enter principal");
        principal = myObj.nextFloat();
        //Enter rate and press Enter
        System.out.println("Enter rate");
        rate = myObj.nextFloat();
        //Enter time and press Enter
        System.out.println("Enter time");
        time = myObj.nextFloat();
        interest =(principal*rate*time)/100;
        System.out.println("Your interest is:"+interest);
    }
}
