package com.oshovskii.geekbrains.java_2.lesson_02;

public class ConversionToArrayString {

    public String[][] getArray(String str) throws FormatStringException, SizeArrayException {

        String[] strings = str.split("\\W+");
        String[][] array = new String[4][4];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    if (checkString(strings[pos])) {
                        array[i][j] = strings[pos++];
                    }
                    else {
                        throw new FormatStringException("String is incorrect");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Array is incorrect");
                }
            }
        }
        if (strings.length != 16) {
            throw new SizeArrayException("Arrays size is incorrect");
        }
        return array;
    }

    public boolean checkString(String string) {
        if (string == null || string.length() == 0) return false;

        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
