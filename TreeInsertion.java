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

class TreeInsertion {
    
    public static void main(String[] args) {

        // Binary search tree
        class Node {
            int value;
            int children;
            Node left;
            Node right;

            Node(int value) {
                this.value = value;
                this.children = 1;
                this.left = null;
                this.right = null;
            }

            boolean hasRight() {
                return this.right != null;
            }

            boolean hasLeft() {
                return this.left != null;
            }

        }

        class Tree {

            Node root;
            
            Tree() {
                this.root = null;
            }

            void insert(int value) {
                this.root = insertHelper(this.root, value);
            }

            Node insertHelper(Node node, int value) {
                if (node == null) {
                    node = new Node(value);
                    return node;
                }
                if (value < node.value) {
                    node.left = insertHelper(node.left, value);
                } else if (value >= node.value) {
                    node.right = insertHelper(node.right, value);
                }
                node.children++;
                return node;
            }

            BigInteger getPermutations() {
                BigInteger[][] mtx = new BigInteger[100 + 1][100 + 1]; // children count holder
                for (int i = 0; i < mtx.length; i++) 
                    Arrays.fill(mtx[i], BigInteger.ONE);
                for (int i = 1; i < mtx.length; i++) 
                    for (int j = 1; j < mtx.length; j++) 
                        mtx[i][j] = mtx[i - 1][j].add(mtx[i][j - 1]);

                for (int i = 1; i < mtx.length; i++) {
                    for (int j = 1; j < mtx.length; j++) {
                        System.out.print(mtx[i][j] + " ");
                        if (j == 10) break;
                    }
                    System.out.println();
                    if (i == 10) break;
                }    

                return permuteHelper(mtx, this.root);
            }

            BigInteger permuteHelper(BigInteger[][] mtx, Node node) {
                BigInteger permutations = BigInteger.ONE;
                if (node != null) {
                    if (node.hasLeft() && node.hasRight()) 
                        permutations = mtx[node.left.children][node.right.children]; // left + right children
                    permutations = permutations
                                        .multiply(permuteHelper(mtx, node.left))
                                        .multiply(permuteHelper(mtx, node.right));
                }
                return permutations;
            }

        }

        // counting permutations is just factorial

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            Tree tree = new Tree();
            while (n-- > 0) 
                tree.insert(sc.getInt());
            sb.append(tree.getPermutations()).append("\n");
        }
        System.out.print(sb.toString());                    
        sc.close();
    }
    
}
