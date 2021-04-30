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

class ConversationLog {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Set<String>> setMap = new HashMap<>();
        HashMap<String, Integer> stringCount = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String[] arr = sc.nextLine().split("\\s+");
            String name = arr[0];
            Set<String> set = new HashSet<>();
            if (setMap.containsKey(name))
                set = setMap.get(name);
            setMap.put(name, set);
            for (int i = 1; i < arr.length; i++) {
                set.add(arr[i]);
                stringCount.put(arr[i], (stringCount.containsKey(arr[i]) ? stringCount.get(arr[i]) : 0) + 1);
            }            

        }
        ArrayList<Entry<String, Set<String>>> setList = new ArrayList<>(setMap.entrySet());
        Set<String> set = setList.get(0).getValue();
        for (int i = 1; i < setList.size(); i++)
            set.retainAll(setList.get(i).getValue());
        if (set.size() == 0) {
            System.out.println("ALL CLEAR");
        } else {
            ArrayList<Entry<String, Integer>> stringList = new ArrayList<>(stringCount.entrySet());
            Collections.sort(stringList, new Comparator<>() {
                @Override
                public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                    return e1.getValue() == e2.getValue() ? e1.getKey().compareTo(e2.getKey()) : e2.getValue().compareTo(e1.getValue());
                }
            });
            for (Entry<String, Integer> e : stringList)
                if (set.contains(e.getKey())) 
                    System.out.println(e.getKey());
        }
        sc.close();
    }
    
}
