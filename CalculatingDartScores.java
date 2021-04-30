import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.text.*;

/*
 * @author Theodoric Keith Lim
 */

class CalculatingDartScores {
    
    private final static String[] section = new String[] {"single", "double", "triple"};
    private final static int[] scores = new int[60];

    public static void main(String[] args) {
        System.out.print(foo(new java.util.Scanner(System.in).nextInt()));
    }

    static String foo(int score) {
        StringBuilder sb = new StringBuilder();
        if (score < 0 || score > 180) return "impossible";
        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;
        for (int i = 3; i < 60; i += 3) {
            scores[i] = scores[i - 3] + 1;
            scores[i + 1] = scores[i - 2] + 2;
            scores[i + 2] = scores[i - 1] + 3;
        }
        boolean f = false;
        for (int i = 0; i < 60 && !f; i++) {
            if (score == scores[i]) {
                toOut(sb, i);
                f = true;
            }
            for (int j = 0; j < 60 && !f; j++) {
                if (score == scores[i] + scores[j]) {   
                    toOut(sb, i);
                    toOut(sb, j);
                    f = true;
                }
                for (int k = 0; k < 60 && !f; k++) {
                    if (score == scores[i] + scores[j] + scores[k]) {   
                        toOut(sb, i);
                        toOut(sb, j);
                        toOut(sb, k);
                        f = true;
                    }
                }
            }
        }
        return f ? sb.toString() : "impossible\n";
    }

    static void toOut(StringBuilder sb, int x) {
        sb.append(section[x % 3]).append(" ").append(x / 3 + 1).append("\n");
    }
    
}
