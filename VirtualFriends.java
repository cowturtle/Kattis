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
// https://www.youtube.com/watch?v=wU6udHRIkcc
// Key points for this question
// 1. parents: To help us locate the parent of any one index. Think of it as a tree within an array. A parent will be noted as -1. 
//             E.g. if the array {-1, 0, 1}. Then pos 0 is a parent, pos 1 is a direct child of pos 0 and pos 2 is a direct child of pos 1.
// 2. connections: To record down the extent of each parent
// 3. HashMap used to record indexes of friends
// 4. getParent function
//    Recursive function that helps us locate the root/first parent of the particular index. 
//    This makes EVERYTHING faster. Because now you do not have to continuously run through the entire tree 
//    which incurs massive cost. 
//    **Note the 2nd return of the function as we assign those in the path of this graph the parent value
//      Following the previous example {-1, 0, 1}, this will become {-1, 0, 0} as both are children or pos 0.
// 5. union function
//    Rather straightforward function as we locate the root/first parent of each index. If they are the same,
//    it lets us know that including this edge will cause a cycle and we do not want that, therefore the union is not performed.
//    ** A cycle is unwanted is not the only reason. Another reason would be that these two people have already made a prior connection
//       through the current graph that they are already a part of, therefore there is no need to count them again (double counting).
//
//    The union function itself is very simple. It can work both ways. We assign the any one of the parent's they value of the other.
//    Now, one of the parents loses its root identity of -1, and is joined to the other. 
//    We merely add the connections of the first and second together to receive a new total.
//    In mine, the first parent is adopted by the second. Therefore second connections are increased by the first.
//
//    Bad practice, i returned the connections to be printed via the union function. yes i got lazy.
//
// 6. Thank you indian man from youtube, it was a really helpful video.
class VirtualFriends {
    
    private static final int[] parents = new int[2 * 100000];
    private static final int[] connections = new int[2 * 100000];

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int f = sc.getInt();
            for (int i = 0; i <= f * 2; i++) {
                parents[i] = i;
                connections[i] = 1;
            }
            HashMap<String, Integer> indexes = new HashMap<>();
            for (int i = 0, index = 0; i < f; i++) {
                String first = sc.getWord(), second = sc.getWord();
                if (!indexes.containsKey(first)) indexes.put(first, index++);
                if (!indexes.containsKey(second)) indexes.put(second, index++);
                sb.append(union(indexes.get(first), indexes.get(second))).append("\n");
            }
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static int getParent(int index) {
        if (parents[index] == index) return index;
        return parents[index] = getParent(parents[index]);
    }

    static int union(int first, int second) {
        first = getParent(first);
        second = getParent(second);
        if (first != second) {
            parents[first] = second;
            connections[second] += connections[first];
        }
        return connections[second];
    }
    
}
