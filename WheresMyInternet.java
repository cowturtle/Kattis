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

class WheresMyInternet {
    
    public static void main(String[] args) {

        class Node {
            int value;
            ArrayList<Integer> children;
            Node(int value) {
                this.value = value;
                this.children = new ArrayList<>();
            }
        }
        
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.getInt(), m = sc.getInt();
        
        ArrayList<Node> nodes = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        nodes.add(new Node(0)); // space filler
        for (int i = 1; i <= n; i++) // Instantiate houses
            nodes.add(new Node(i));

        while (m-- > 0) { // Read in connections
            int head = sc.getInt(), tail = sc.getInt();
            nodes.get(head).children.add(tail);
            nodes.get(tail).children.add(head);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(); // Breath first search
        queue.offer(1);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int c : nodes.get(curr).children) 
                if (!visited[c]) {
                    visited[c] = true;
                    queue.offer(c);
                }
        }

        for (int i = 2; i < n + 1; i++) // check print
            if (!visited[i]) sb.append(i).append("\n");

        System.out.println(sb.length() == 0 ? "Connected" : sb.toString().trim());
    }
    
}
