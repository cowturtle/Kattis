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

class RacingAroundTheAlphabet {
    
    public static void main(String[] args) {
        new RacingAroundTheAlphabet();
    }

    RacingAroundTheAlphabet() {
        answer();
    }

    static final double SPEED = 15.0; // feet / second
    static final double PICK_UP = 1.0; // second
    static final double STEP = Math.PI * 60 / 28; // feet

    void answer() { 
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> circle = new ArrayList<>();
        fillCircle(circle);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            double total = PICK_UP;
            char[] arr = sc.nextLine().toCharArray();
            for (int i = 0; i < arr.length - 1; i++) {
                int one = circle.indexOf(arr[i]);
                int two = circle.indexOf(arr[i + 1]);
                int a = Math.min(one, two);
                int b = Math.max(one, two);
                int diff = b - a;
                total += Math.min(diff, 28 - diff) * STEP / SPEED;
                total += PICK_UP; 
            }
            sb.append(total).append("\n");
        }

        System.out.println(sb.toString());        
        sc.close();
    }

    void fillCircle(ArrayList<Character> circle) {
        for (int i = 0; i < 26; i++)
            circle.add((char) ('A' + i));
        circle.add(' ');
        circle.add('\'');
    }
    
}
