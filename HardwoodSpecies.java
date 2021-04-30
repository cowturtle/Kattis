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

class HardwoodSpecies {
    
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);
            String tree = "";
            double total = 0;
            int[] count = new int[10000 + 1];
            TreeMap<String, Integer> indexer = new TreeMap<>();
            while ((tree = br.readLine()) != null) {
                if (!indexer.containsKey(tree)) 
                    indexer.put(tree, indexer.size());
                count[indexer.get(tree)]++;
                total++;
            }
            for (Entry<String, Integer> e : indexer.entrySet())
                out.println(e.getKey() + " " + (count[e.getValue()] * 100 / total));
            out.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }        
    }
    
}
