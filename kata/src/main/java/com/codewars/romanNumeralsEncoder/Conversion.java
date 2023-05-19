package com.codewars.romanNumeralsEncoder;

public class Conversion {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n >= 1000) {
                sb.append("M");
                n -= 1000;
                continue;
            }
            if (n >= 900) {
                sb.append("CM");
                n -= 900;
                continue;
            }
            if (n >= 500) {
                sb.append("D");
                n -= 500;
                continue;
            }
            if (n >= 400) {
                sb.append("CD");
                n -= 400;
                continue;
            }
            if (n >= 100) {
                sb.append("C");
                n -= 100;
                continue;
            }
            if (n >= 90) {
                sb.append("XC");
                n -= 90;
                continue;
            }
            if (n >= 50) {
                sb.append("L");
                n -= 50;
                continue;
            }
            if (n >= 40) {
                sb.append("XL");
                n -= 40;
                continue;
            }
            if (n >= 10) {
                sb.append("X");
                n -= 10;
                continue;
            }
            if (n >= 9) {
                sb.append("IX");
                n -= 9;
                continue;
            }
            if (n >= 5) {
                sb.append("V");
                n -= 5;
                continue;
            }
            if (n >= 4) {
                sb.append("IV");
                n -= 4;
                continue;
            }
            sb.append("I");
            n -= 1;
        }
        return sb.toString();
    }
}

/*
                    Symbol    Value
                        I          1
                        V          5
                        X          10
                        L          50
                        C          100
                        D          500
                        M          1,000
*/
