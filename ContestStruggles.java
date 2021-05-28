/*
 * @author Theodoric Keith Lim
 */

class ContestStruggles
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int totalProblems = sc.getInt();
        int solvedProblems = sc.getInt();        
        int avgTotalDifficulty = sc.getInt();        
        int avgSolvedDifficulty = sc.getInt();
        
        double unsolvedProblems = totalProblems - solvedProblems;
        double totalDifficulty = totalProblems * avgTotalDifficulty;
        double totalSolvedDifficulty = solvedProblems * avgSolvedDifficulty;
        double totalUnsolvedDifficulty = totalDifficulty - totalSolvedDifficulty;
        double avgUnsolvedDifficulty = totalUnsolvedDifficulty / unsolvedProblems;

        if (totalUnsolvedDifficulty > 100 * unsolvedProblems)
        {
            sc.println("impossible");
        }
        else if (0 <= avgUnsolvedDifficulty && avgUnsolvedDifficulty <= 100) 
        {
            sc.printf("%.6f\n", avgUnsolvedDifficulty);
        }
        else
        {
            sc.println("impossible");
        }

        sc.close();
    }
    public static void main(String[] args)
    {
        new ContestStruggles().run();
    }
}