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

class CoconutSplat {
    
    public static void main(String[] args) {

        class Player {
            int index;
            int strikes;

            Player(int index) {
                this.index = index;
                this.strikes = 0;
            }

            Player(int index, int strikes) {
                this.index = index;
                this.strikes = strikes;
            }
        }

        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int syllabus = arr[0], playerCount = arr[1];
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 1; i <= playerCount; i++)
            players.add(new Player(i));
        int i = 0;
        while (players.size() > 1) {
            i = (i + syllabus - 1) % players.size();
            if (players.get(i).strikes == 0) {
                players.get(i).strikes = 1;
                players.add(i + 1, new Player(players.get(i).index, 1));
            } else if (players.get(i).strikes == 1) {
                players.get(i).strikes = 2;
                i++;
            } else {
                players.remove(i);
            }
        }
        System.out.println(players.get(0).index);
    }
    
}
