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

class UnbearableZoo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0, i = 1;
        while ((n = Integer.parseInt(sc.nextLine())) != 0) {
            sb.append("List " + i++ + ":").append("\n");
            ArrayList<String> animalList = new ArrayList<>();
            while (n-- > 0) {
                String[] animal = sc.nextLine().split("\\s+");
                animalList.add(animal[animal.length - 1].toLowerCase());
            }
            Collections.sort(animalList);
            String curr = animalList.get(0);
            int count = 1;
            for (int j = 1; j < animalList.size(); j++) {
                if (animalList.get(j).equals(curr)) {
                    count++;
                } else {
                    sb.append(curr);
                    sb.append(" | ");
                    sb.append(count);
                    sb.append("\n");
                    curr = animalList.get(j);
                    count = 1;
                }
            }
            sb.append(curr);
            sb.append(" | ");
            sb.append(count);
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
