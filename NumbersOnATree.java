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

class NumbersOnATree {
    
    public static void main(String[] args) {

        // class Node {
        //     final int value;
        //     Node left;
        //     Node right;

        //     Node(int value) {
        //         this.value = value;
        //         this.left = null;
        //         this.right = null;
        //     }
        // }

        // class Tree {
        //     void insert(Node node, int value) {
        //         if (value < node.value) {
        //             if (node.left == null) {
        //                 node.left = new Node(value);
        //             } else {
        //                 insert(node.left, value);
        //             }
        //         } else if (value > node.value) {
        //             if (node.right == null) {
        //                 node.right = new Node(value);
        //             } else {
        //                 insert(node.right, value);
        //             }
        //         }
        //     }
        // }

        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        int rootVal = 0;
        int ans = 0;
        int height = Integer.parseInt(arr[0]);
        for (int i = 0; i <= height; i++)
            rootVal += Math.pow(2, i);

        if (arr.length == 1) {
            ans = rootVal;
        } else {
            int len = arr[1].length();
            int pow = 1;
            for (int i = 0; i < len; i++)
                if (arr[1].charAt(i) == 'L') {
                    rootVal -= pow;
                    pow *= 2;                    
                } else {
                    rootVal -= pow + 1;
                    pow *= 2;
                    pow++; // children on the right side will be smaller by 1 as compared to left
                }
            ans = rootVal;
            // Node root = new Node(rootVal);
            // Tree tree = new Tree();
            // for (int i = root.value; i > 0; i--)
            //     tree.insert(root, i);
        }
        System.out.println(ans);
    }
    
}
