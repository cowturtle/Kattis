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

class BusySchedule {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Integer[]> com = new Comparator<>() {
            @Override
            public int compare(Integer[] arr1, Integer[] arr2) {
                // 0 1 2, hour, minute, am 0 pm 1
                if (arr1[2] == arr2[2]) {
                    if (arr1[0] != arr2[0]) {
                        if (arr1[0] == 12) {
                        return -1;
                        } else if (arr2[0] == 12) {
                            return 1;
                        } else {
                            return arr1[0] - arr2[0];
                        }   
                    }                    
                    return arr1[1] - arr2[1];
                }
                return arr1[2] - arr2[2];
            }
        };
        while (true) {
            int n = sc.getInt();
            if (n == 0) break;
            ArrayList<Integer[]> al = new ArrayList<>();
            while (n-- > 0) {
                Integer[] arr = new Integer[3];
                int[] arr2 = Arrays.stream(sc.getWord().split(":")).mapToInt(Integer::parseInt).toArray();
                arr[0] = arr2[0];
                arr[1] = arr2[1];
                arr[2] = sc.getWord().equals("a.m.") ? 0 : 1;
                al.add(arr);
            }
            Collections.sort(al, com);
            for (Integer[] arr : al) 
                sb.append(arr[0])
                    .append(":")
                    .append(arr[1] < 10 ? "0" + arr[1] : arr[1])
                    .append(" ")
                    .append(arr[2] == 0 ? "a.m." : "p.m.")
                    .append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
