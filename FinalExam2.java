class FinalExam2
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int finalScore = 0;
        int n = sc.getInt();
        
        char curr = '\u0000', prev = '\u0000';
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                curr = sc.getWord().charAt(0);
            }
            else
            {
                prev = curr;
                curr = sc.getWord().charAt(0);

                if (prev == curr)
                {
                    finalScore++;
                }
            }
        }

        System.out.println(finalScore);

        sc.close();
    }
}