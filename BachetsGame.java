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

class BachetsGame {
    
    public static void main(String[] args) {
        new BachetsGame();
    }

    BachetsGame() {
        answer();
    }

    void answer() { 
        // http://web.mit.edu/sp.268/www/nim.pdf
        // Combinatorial Game
        // 1. There are 2 players
        // 2. There is a set, usually finite, of possible positions of the game
        // 3. The rules of the game specify for both players and each position which moves to other positions are legal moves.
        // 4. If the rules make it such that both players have the same options of moving from each position, the game is Impartial, else Partizan
        // 5. Players alternate moving
        // 6. The game ends when a position is reached such that the player to move has no possible moves. 
        //    > Normal-play > win
        //    > Misere-play > lose
        // 7. Game ends in a finite number of moves no matter how it is played
        //
        // > Normal-play, player who takes last move wins
        // > Misere-play, player who takes last move loses
        // Types of Combinatorial games
        // > Impartial game
        // > Partizan game
        //
        // This is an impartial game that is normal-play

        // P-position, N-position and Terminal position

        // P-position > Secures a win for Previous player (the one who just moved) | Losing position
        // N-position > Secures a win for the Next player | Winning position
        // Terminal position > No moves left

        // E.g. Nim > Normal-play (last move wins), 
        // (0,0,1) is considered a N-position as the next player will take 1, leaving (0,0,0) and be considered the winner
        // (1,1,0) is considered a P-position 

        // How to find out whether a Nim position is N or P?
        // > We work backwards from the end of game to the beginning
        // > This is called "Backwards induction"
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();    
        while (sc.hasMoreTokens()) {
            int n = sc.getInt(), m = sc.getInt();
            
            int[] options = new int[m];
            char[] states = new char[n + 1];

            for (int i = 0; i < m; i++)
                options[i] = sc.getInt();
            Arrays.sort(options);
            // P = P-position
            // N = N-position
            // T = Terminal-position
            Arrays.fill(states, 'P'); // 1. Label every terminal position as P, so we just label everything as P
            
            for (int i = 0; i <= n; i++) {
                if (states[i] == 'P') { // 2. Label every position that can reach an P as N
                // This is the "How an N can reach a P"
                    if (i + options[m - 1] <= n) {  // ensuring that the maximum state set to N is not greater or == to n
                        for (int j = 0; j < m; j++)
                            states[i + options[j]] = 'N';
                    } else {
                        for (int j = 0; j < m; j++)
                            if (i + options[j] <= n) states[i + options[j]] = 'N';
                    }
                }
            }

            sb.append(states[n] == 'P' ? "Ollie wins" : "Stan wins").append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}
