package com.oshovskii.geekbrains.java_2.lesson_02;

import java.util.Arrays;

public class Test {

    private static String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

    public static void main(String[] args) {

        try {
            ConversionToArrayString conversionToArrayString = new ConversionToArrayString();
            System.out.println(Arrays.deepToString(conversionToArrayString.getArray(str)));
        } catch (FormatStringException | SizeArrayException e) {
            System.err.println("Error");
        }

        try {
            Arithmetic arithmetic = new Arithmetic();
            ConversionToArrayString conversionToArrayString = new ConversionToArrayString();
            System.out.println(arithmetic.ArraysSumMethod(conversionToArrayString.getArray(str)));
        } catch (SizeArrayException e2) {
            System.err.println("Error array size");
        } catch (FormatStringException e3) {
            System.err.println("Error format");
        }
        System.out.println("===========================================");
        System.out.println(arraysSumMethod(str));
    }


     private static int arraysSumMethod(String str) {

         str = str.replaceAll("\n", " ");
         String[] strArray = str.split(" ");
         int count = 0;
         int Summ = 0;
         int[][] array = new int[4][4];
         for(int[] tmp : array){
             for (int i = 0; i < tmp.length; i++) {
                 Summ += tmp[i] = Integer.parseInt(strArray[count]);
                 count++;
                 System.out.printf("%2d", tmp[i]);
             }
             System.out.println();
        }

          return Summ/2;
     }



}

