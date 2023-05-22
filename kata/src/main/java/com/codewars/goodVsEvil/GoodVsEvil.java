package com.codewars.goodVsEvil;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int g = calculate(goodAmounts.split(" "));
        int e = calculate(evilAmounts.split(" "));
        if (g == e) {
            return "Battle Result: No victor on this battle field";
        } else {
            return g > e ? "Battle Result: Good triumphs over Evil" : "Battle Result: Evil eradicates all trace of Good";
        }
    }

    private static int calculate(String[] p) {
        int power = 0;
        if (p.length < 7) {
            for (int i = 0; i < p.length; i++) {
                power += switch (i) {
                    case 0 -> Integer.parseInt(p[i]);
                    case 1 -> Integer.parseInt(p[i]) * 2;
                    case 2, 3 -> Integer.parseInt(p[i]) * 3;
                    case 4 -> Integer.parseInt(p[i]) * 4;
                    default -> Integer.parseInt(p[i]) * 10;
                };
            }
        } else {
            for (int i = 0; i < p.length; i++) {
                power += switch (i) {
                    case 0 -> Integer.parseInt(p[i]);
                    case 1, 2, 3 -> Integer.parseInt(p[i]) * 2;
                    case 4 -> Integer.parseInt(p[i]) * 3;
                    case 5 -> Integer.parseInt(p[i]) * 5;
                    default -> Integer.parseInt(p[i]) * 10;
                };
            }
        }
        return power;
    }
}


/* Return
"Battle Result: Good triumphs over Evil" if good wins,
"Battle Result: Evil eradicates all trace of Good" if evil wins,
"Battle Result: No victor on this battle field" if it ends in a tie.
*/
