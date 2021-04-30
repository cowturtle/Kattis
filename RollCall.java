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

class RollCall {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        ArrayList<String[]> al = new ArrayList<>();
        Map<String, Integer> firstMap = new HashMap<>();
        Comparator<String[]> comp = new Comparator<>() {
            @Override
            public int compare(String[] arr1, String[] arr2) {
                if (arr1[1].equals(arr2[1])) {
                    return arr1[0].compareTo(arr2[0]);
                }
                return arr1[1].compareTo(arr2[1]);
            }
        };
        while (sc.hasMoreTokens()) {
            String first = sc.getWord(), last = sc.getWord();
            al.add(new String[] {first, last});
            firstMap.put(first, firstMap.containsKey(first) ? firstMap.get(first) + 1 : 1);
        }
            
        Collections.sort(al, comp);
        for (String[] arr : al) {
            if (firstMap.get(arr[0]) > 1) {
                System.out.println(arr[0] + " " + arr[1]);
            } else {
                System.out.println(arr[0]);
            }
        }
        sc.close();
    }
    
}
