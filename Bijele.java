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

class Bijele {
    void answer() {
        // kings, queens, rooks, bishops, knights and pawns
        // 1 1 2 2 2 8
        Scanner sc = new Scanner(System.in);
        System.out.printf(
            "%d %d %d %d %d %d", 
            1 - sc.nextInt(),
            1 - sc.nextInt(),
            2 - sc.nextInt(),
            2 - sc.nextInt(),
            2 - sc.nextInt(),
            8 - sc.nextInt()
        );
        sc.close();
    }
}
