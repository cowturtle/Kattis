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

class CombinationLock {
    
    static final int CALIBRATION_MARKS_TO_DEGREES = 360 / 40;
    static final int TOTAL_CALIBRATION_MARKS = 40;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int origin = 0, first = 0, second = 0, third = 0;
        while (true) {
            origin = sc.getInt();
            first = sc.getInt();
            second = sc.getInt();
            third = sc.getInt();
            if (origin == 0 && first == 0 && second == 0 && third == 0) break;
                    System.out.println(
                        ((2 * (TOTAL_CALIBRATION_MARKS)) // turn the dial clockwise 2 full turns
                        + turnToMark(origin, first) // stop at the first number of the combination
                        + TOTAL_CALIBRATION_MARKS // turn the dial counter-clockwise 1 full turn
                        + turnToMark(second, first) // continue turning counter-clockwise until the 2nd number is reached
                        + turnToMark(second, third)) // turn the dial clockwise again until the 3rd number is reached
                        * CALIBRATION_MARKS_TO_DEGREES
                    );
                }
        sc.close();
    }

    static int turnToMark(int start, int end) {
        return (TOTAL_CALIBRATION_MARKS + start - end) % TOTAL_CALIBRATION_MARKS;
    }
    
}
