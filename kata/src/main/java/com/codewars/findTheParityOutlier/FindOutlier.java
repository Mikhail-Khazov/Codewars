package com.codewars.findTheParityOutlier;

import java.util.Arrays;

public class FindOutlier {
    public static int find(int[] integers) {
        int evenCounter = 0;

        for (int i = 0; i < 3; i++) {
            if ((integers[i] & 1) == 0) evenCounter++;
        }

        return evenCounter > 1 ?
                Arrays.stream(integers).filter(i -> (i & 1) != 0).findFirst().orElseThrow() :
                Arrays.stream(integers).filter(i -> (i & 1) == 0).findFirst().orElseThrow();
    }
}
