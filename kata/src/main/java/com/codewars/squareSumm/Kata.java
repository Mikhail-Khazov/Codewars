package com.codewars.squareSumm;

import java.util.Arrays;

public class Kata {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(i -> (int)Math.pow(i,2)).sum();
    }
}
