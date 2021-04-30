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

class EenyMeeny {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> kids = new ArrayList<>();
        ArrayList<String> teamA = new ArrayList<>();
        ArrayList<String> teamB = new ArrayList<>();
        int ro = sc.nextLine().split("\\s+").length - 1; 
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
            kids.add(sc.nextLine());
        int prevPos = 0;
        for (int i = 0; i < n; i++)
            prevPos = addToTeam(prevPos, ro, kids, i % 2 == 0 ? teamA : teamB);
        print(teamA);
        print(teamB);
        sc.close();
    }

    static void print(ArrayList<String> team) {
        System.out.println(team.size());        
        for (String s : team)
            System.out.println(s);
    }

    static int addToTeam(int prevPos, int ro, ArrayList<String> kids, ArrayList<String> team) {
        int i = (prevPos + ro) % kids.size();
        team.add(kids.remove(i));
        return i;
    }
    
}
