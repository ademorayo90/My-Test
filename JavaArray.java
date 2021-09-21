package com.Graham;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
      // int [] array1 = new int [5];
       //array1[0] = 20;
      // array1[1] = 1;
       //array1[4] =4;

       // System.out.println(Arrays.toString(array1));
        //String [] fruits = {"mangoes","apple","orange","grape"};
       // System.out.println(Arrays.toString(fruits));
        // int [] [] doubleDimen = new int [4] [3];

        //doubleDimen [0] [0] =20;
          //      doubleDimen [0] [1] =30;
           //     doubleDimen [1] [2] =40;

        //System.out.println(Arrays.deepToString(doubleDimen));
        String [] [] TwoDimension = new String[4][3];
        TwoDimension [0] [0] = "Mangoes";
                TwoDimension [0] [1] = "Grapes";
                TwoDimension [1] [2] = "Bananas";
                TwoDimension [3] [0] = "Apples";
        System.out.println(Arrays.deepToString(TwoDimension));






    }
}
