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

class RaggedRight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while (sc.hasNextLine()) 
            al.add(sc.nextLine().length());
        int max = Collections.max(al);
        int sum = 0;
        for (int i = 0; i < al.size() - 1; i++)
            sum += Math.pow(max - al.get(i), 2);
        System.out.println(sum);
    }

}
