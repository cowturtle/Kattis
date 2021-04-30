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

class PlantingTrees {
    public static void main(String[] args) {
        new PlantingTrees();
    }

    PlantingTrees() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Integer[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                        .mapToInt(x -> Integer.parseInt(x))
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .toArray(x -> new Integer[n]);
        sc.close();
        List<Integer> list = IntStream
                        .iterate(1, x -> x + 1)
                        .limit(n).map(y -> arr[y - 1] + y)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(Collections.max(list) + 1);
    }
    
}
