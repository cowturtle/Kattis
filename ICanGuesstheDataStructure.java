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

class ICanGuesstheDataStructure {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int n = sc.getInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.getInt();
                arr[i][1] = sc.getInt();
            }
            boolean stack = isStack(arr);
            boolean queue = isQueue(arr);
            boolean priorityqueue = isPriorityQueue(arr);
            int c = (stack ? 1 : 0) + (queue ? 1 : 0) + (priorityqueue ? 1 : 0);
            // System.out.println(stack + " " + queue + " " + priorityqueue);
            if (c == 0) {
                sb.append("impossible");
            } else if (c > 1) {
                sb.append("not sure");
            } else if (stack) {
                sb.append("stack");
            } else if (queue) {
                sb.append("queue");
            } else if (priorityqueue) {
                sb.append("priority queue");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean isStack(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int[] ar : arr) {
            int op = ar[0];
            switch(op) {
                case 1:
                    stack.push(ar[1]);
                    break;
                case 2:
                    if (stack.isEmpty()) return false;
                    int x = stack.pop();
                    if (x != ar[1]) return false;
                    break;
                default: return false;
            }
        }
        return true;
    }

    static boolean isQueue(int[][] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int[] ar : arr) {
            int op = ar[0];
            switch(op) {
                case 1:
                    queue.offer(ar[1]);
                    break;
                case 2:
                    if (queue.isEmpty()) return false;
                    int x = queue.poll();
                    if (x != ar[1]) return false;
                    break;
                default: return false;
            }
        }
        return true;
    }

    static final Comparator<Integer> comp = new Comparator<>() {
        @Override
        public int compare(Integer i1, Integer i2) {
            return i2.compareTo(i1);
        }
    };

    static boolean isPriorityQueue(int[][] arr) {
        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>(comp);
        for (int[] ar : arr) {
            int op = ar[0];
            switch(op) {
                case 1:
                    priorityqueue.offer(ar[1]);
                    break;
                case 2:
                    if (priorityqueue.isEmpty()) return false;
                    int x = priorityqueue.poll();
                    if (x != ar[1]) return false;
                    break;
                default: return false;
            }
        }
        return true;
    }
    
}
