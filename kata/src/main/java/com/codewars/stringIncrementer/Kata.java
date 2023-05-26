package com.codewars.stringIncrementer;

public class Kata {
    public static String incrementString(String str) {
        if (!str.isEmpty() && Character.isDigit(str.charAt(str.length() - 1))) {
            StringBuilder sb = new StringBuilder(str);
            for (int i = sb.length() - 1; i >= 0; i--) {
                int c = sb.charAt(i);
                if (c < 48 || c > 57) {
                    sb.insert(i + 1, "1");
                    return sb.toString();
                } else if (c < 57) {
                    sb.replace(i, i + 1, Character.toString(c + 1));
                    return sb.toString();
                } else {
                    sb.replace(i, i + 1, "0");
                }
            }
            return sb.insert(0, "1").toString();
        } else {
            return str + "1";
        }
    }
}

