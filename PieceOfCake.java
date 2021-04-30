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

class PieceOfCake {
    public static void main(String[] args) {
        new PieceOfCake();
    }

    PieceOfCake() {
        answer();
    }

    static final int CAKE_HEIGHT = 4;

    void answer() {
        int[] _INPUT = java.util.Arrays.stream(
                                new java.util.Scanner(System.in)
                                .nextLine()
                                .split("\\s+"))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        int _LENGTH = _INPUT[0];
        int AREA_1 = _INPUT[1] * _INPUT[2];
        int AREA_2 = (_LENGTH - _INPUT[1]) * _INPUT[2];
        int AREA_3 = _INPUT[1] * (_LENGTH - _INPUT[2]);
        int AREA_4 = (_LENGTH - _INPUT[1]) * (_LENGTH - _INPUT[2]);
        
        int max = AREA_1;
        max = (int) Math.max(max, AREA_2);
        max = (int) Math.max(max, AREA_3);
        max = (int) Math.max(max, AREA_4);

        System.out.println(max * CAKE_HEIGHT);
    }
}
