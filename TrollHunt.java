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

class TrollHunt {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bridges = arr[0] - 1, knights = arr[1], needed = arr[2], groups = knights / needed; // it wont go to that bridge that it used to conduct its "shady business"
        System.out.println(bridges % groups == 0 ? bridges / groups : bridges / groups + 1);
    }
    
}
