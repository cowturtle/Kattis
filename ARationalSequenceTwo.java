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

class ARationalSequenceTwo {
    
    public static void main(String[] args) {
        new ARationalSequenceTwo();
    }

    ARationalSequenceTwo() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int P = sc.getInt();

        while (P-- > 0) {
            int K = sc.getInt();
            int[] arr = Arrays.stream(sc.getWord().split("/"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            Node curr = new Node(arr[0], arr[1]);
            ArrayDeque<Node> arrDeq = new ArrayDeque<>();

            while (curr.n != 1 || curr.d != 1) {
                arrDeq.offerFirst(curr.duplicate());

                if (curr.n > curr.d) {
                    curr.n -= curr.d;
                } else {
                    curr.d -= curr.n;
                }
            }

            int x = 1;
            while (!arrDeq.isEmpty()) {
                Node temp = arrDeq.poll();
                x *= 2;
                x += temp.n > temp.d ? 1 : 0;
            }
            System.out.printf("%d %d\n", K, x);
        }
        // sc.close();
    }

}

class Node {
    int n, d;
    Node(int n, int d) {
        this.n = n;
        this.d = d;
    }

    Node duplicate() {
        return new Node(this.n, this.d);
    }
}
