package com.li;

public class StringPractice {
    public static void main(String[] args) {
        String str = "abcd123.345";
        System.out.println(getString(str));
    }

    public static String getString(String str) {
        String getNumber;
        getNumber = str.replaceAll("[a-z|A-Z]", "");
        if (getNumber.indexOf(".") == -1) {
            getNumber = getNumber + ".00";
        } else {
            if (getNumber.indexOf(".") == getNumber.length() - 1) {
                getNumber = getNumber + "00";
            } else if (getNumber.indexOf(".") == getNumber.length() - 2) {
                getNumber = getNumber + "0";
            } else {
                getNumber = getNumber.substring(0, getNumber.indexOf(".") + 3);
            }

        }
        return getNumber;
    }
}
