package com.codewars.simplePigLatin;

public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("^[\\p{Punct}]+$")) {
                sb.append(words[i]);
            } else {
                words[i] = sb.append(words[i].substring(1)).append(words[i].charAt(0)).append("ay").toString();
                sb.delete(0, words[i].length());
            }
        }
        return String.join(" ", words);
    }
}
