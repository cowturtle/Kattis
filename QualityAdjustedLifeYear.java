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

class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        new QualityAdjustedLifeYear();
    }

    QualityAdjustedLifeYear() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
            String.format("%.3f",
                java.util.stream.IntStream.range(0, Integer.parseInt(sc.nextLine()))
                    .mapToDouble(x -> java.util.Arrays.stream(
                        sc.nextLine()
                        .split("\\s+"))
                        .mapToDouble(Double::parseDouble)
                        .reduce((y,z) -> y * z)
                        .getAsDouble())
                .reduce((x,y) -> x + y).getAsDouble()));
        sc.close();
    }
}
