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

class PizzaHawaii {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Entry<String, Integer>> comp = new Comparator<>(){
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getKey().compareTo(e2.getKey());
            }
        };
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            HashMap<String, Integer> foreignIngredients = new HashMap<>();
            HashMap<String, Integer> englishIngredients = new HashMap<>();
            while (n-- > 0) {
                String pizza = sc.getWord();
                int pizzaCode = pizza.hashCode();
                int foreignCount = sc.getInt();
                String ingredient = "";
                while (foreignCount-- > 0) 
                    foreignIngredients.put(ingredient = sc.getWord(), (foreignIngredients.containsKey(ingredient) ? foreignIngredients.get(ingredient) : 0) + pizzaCode);
                int englishCount = sc.getInt();
                while (englishCount-- > 0) 
                    englishIngredients.put(ingredient = sc.getWord(), (englishIngredients.containsKey(ingredient) ? englishIngredients.get(ingredient) : 0) + pizzaCode);               
            }
            ArrayList<Entry<String, Integer>> foreignList = new ArrayList<>(foreignIngredients.entrySet());
            ArrayList<Entry<String, Integer>> englishList = new ArrayList<>(englishIngredients.entrySet());
            Collections.sort(foreignList, comp);
            Collections.sort(englishList, comp);
            for (int i = 0; i < foreignList.size(); i++) 
                for (int j = 0; j < englishList.size(); j++) 
                    if (foreignList.get(i).getValue().equals(englishList.get(j).getValue())) 
                        sb.append("(").append(foreignList.get(i).getKey()).append(", ").append(englishList.get(j).getKey()).append(")").append("\n");           
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}
