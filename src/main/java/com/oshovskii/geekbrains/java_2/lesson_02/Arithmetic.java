package com.oshovskii.geekbrains.java_2.lesson_02;

public class Arithmetic {

    public int ArraysSumMethod(String[][] str) throws SizeArrayException {

        if (str.length != 4 || str[0].length != 4) {
            throw new SizeArrayException("Arrays size is incorrect");
        }
        int summ = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                try {
                    summ += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    System.err.println("Number format error!");
                }
            }
        }
        return summ/2;
    }

}
