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

class KittenOnATree {
    
    public static void main(String[] args) {

        class Node {
            int value;
            List<Integer> branches = new ArrayList<>();

            Node(int value) {
                this.value = value;
            }

            void addBranch(int i) {
                this.branches.add(i);
            }

            boolean searchBranch(int i) {
                return this.branches.contains(i);
            }          

        }

        Scanner sc = new Scanner(System.in);
        int kitten = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();        
        ArrayList<Node> al = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.length() == 2 && Integer.parseInt(s) == -1) break;
            int[] arr = Arrays.stream(s.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Node n = new Node(arr[0]);
            for (int i = 1; i < arr.length; i++)
                n.addBranch(arr[i]);
            al.add(n);
        }
        while (true) {
            int next = -1;
            sb.append(kitten).append(" ");
            for (Node n : al) {
                if (n.searchBranch(kitten)) {
                    next = n.value;
                    break;
                }
            }
            if (next == -1) break;
            kitten = next;
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
