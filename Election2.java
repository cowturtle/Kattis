import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Election2
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String name;
        int[] votes = new int[n];
        
        String[] parties = new String[n];
        Map<String, Integer> hmap = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            name = sc.nextLine();
            parties[i] = sc.nextLine();
            hmap.put(name, i);
        }      

        int m = Integer.parseInt(sc.nextLine());

        
        while (m-- > 0)
        {
            name = sc.nextLine();
            if (hmap.containsKey(name))
            {
                votes[hmap.get(name)]++;
            }            
        }

        boolean tie = false;
        int i = 0, j = 0, votemax = 0;

        for (i = 0; i < votes.length; i++)
        {
            if (votes[i] > votemax)
            {
                votemax = votes[i];
                j = i;
                tie = false;
            }
            else if (votes[i] == votemax)
            {
                tie = true;
            }
        }

        System.out.println(tie ? "tie" : parties[j]);

        sc.close();
    }
    public static void main(String[] args)
    {
        new Election2().run();
    }
}