package com.Graham;

public class StringOperations1 {
    public static void main(String[] args) {
        String word = "DEMOCRACY";
        StringBuffer idea =new StringBuffer(word);
        idea.reverse();
        System.out.println(idea);

        System.out.println(idea.substring(4,8));


    }
}
