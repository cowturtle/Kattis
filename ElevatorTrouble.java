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

class ElevatorTrouble {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int floors = arr[0], start = arr[1], goal = arr[2], up = arr[3], down = arr[4];
        long[] count = new long[floors + 1];
        boolean[] visited = new boolean[floors + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            int possibleUp = curr + up;
            int possibleDown = curr - down;
            calculateNext(count, visited, queue, curr, possibleUp);
            calculateNext(count, visited, queue, curr, possibleDown);
        }
        System.out.println(visited[goal] ? count[goal] : "use the stairs");
    }
    
    static void calculateNext(long[] count, boolean[] visited, Queue<Integer> queue, int curr, int possible) {
        if (0 < possible && possible < count.length && !visited[possible]) {
            visited[possible] = true;
            count[possible] = count[curr] + 1L;
            queue.offer(possible);
        }
    }

}
