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

class AssigningWorkstations {

    public static void main(String[] args) {

        class Researcher implements Comparable<Researcher> {
            int start, end;

            Researcher(int start, int stay) {
                this.start = start;
                this.end = start + stay;
            }

            @Override
            public int compareTo(Researcher other) {
                return this.start - other.start;
            }            

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        Researcher[] researchers = new Researcher[n];
        PriorityQueue<Integer> machines = new PriorityQueue<>();
        Queue<Integer> tmpQueue = new LinkedList<>(); // need not be sorted as elements should already be sorted due to usage
        int unlocks = 0;
        for (int i = 0; i < n; i++) 
            researchers[i] = new Researcher(sc.getInt(), sc.getInt());
        Arrays.sort(researchers);
        for (int i = 0; i < n; i++) {   
            Researcher r = researchers[i];
            while (!machines.isEmpty() && machines.peek() <= r.start) // check that machines are within usage range of researcher, machine not being used and haven't been locked
                tmpQueue.add(machines.poll() + m);
            while (!tmpQueue.isEmpty() && tmpQueue.peek() < r.start) // check that these machines are not locked before the researcher can use it
                tmpQueue.poll();
            if (!tmpQueue.isEmpty()) { // if it is not empty, it suggest that there is machine available to be used.
                tmpQueue.poll();
            } else {
                unlocks++;
            }
            machines.offer(r.end);
        }
        System.out.println(n - unlocks);
        sc.close();   
    }

}
