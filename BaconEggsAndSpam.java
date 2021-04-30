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

class BaconEggsAndSpam {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = Integer.parseInt(sc.nextLine())) != 0) {
            
            HashMap<String, ArrayList<String>> hmap = new HashMap<>();
            Set<String> tmpfoodlist = new HashSet<>();
            ArrayList<String> namelist = new ArrayList<>();
            while (n-- > 0) {
                String[] tmp = sc.nextLine().split("\\s+");
                ArrayList<String> work = new ArrayList<>();
                for (int i = 1; i < tmp.length; i++)
                    work.add(tmp[i]);
                String name = tmp[0];
                namelist.add(name);
                hmap.put(name, work); 
                for (String s : work)
                    tmpfoodlist.add(s);
            }
            Collections.sort(namelist);
            ArrayList<String> foodlist = new ArrayList<>(tmpfoodlist);
            Collections.sort(foodlist);
            for (String food : foodlist) {
                sb.append(food).append(" ");
                for (String name : namelist) {
                    if (hmap.get(name).contains(food)) sb.append(name).append(" ");
                }
                sb.append("\n");
            }

            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
