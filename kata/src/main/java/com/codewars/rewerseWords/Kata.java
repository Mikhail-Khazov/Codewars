package com.codewars.rewerseWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String reverseWords(final String original) {
        if (original.isBlank()) return original;
        StringBuilder sb = new StringBuilder(original);
        List<String> sdrow = Arrays.asList(sb.reverse().toString().split("\\s"));
        Collections.reverse(sdrow);
        return String.join(" ", sdrow);
    }
}
/*
  Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

  Examples
  "This is an example!" ==> "sihT si na !elpmaxe"
  "double  spaces"      ==> "elbuod  secaps"
 */
