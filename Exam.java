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

class Exam {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int friend_correct = sc.getInt(), mine_correct_max = 0;
        char[] mine = sc.getWord().toCharArray(), friend = sc.getWord().toCharArray();
        int friend_wrong = friend.length - friend_correct;
        int len = mine.length;
        // Either way, i am always right
        for (int i = 0; i < mine.length; i++) {
            if (mine[i] == friend[i] && friend_correct > 0) {
                friend_correct--;
                mine_correct_max++;
            } else if (mine[i] != friend[i] && friend_wrong > 0) {
                friend_wrong--;
                mine_correct_max++;
            }            
        }
        System.out.println(mine_correct_max);
        sc.close();
    }
    
}
