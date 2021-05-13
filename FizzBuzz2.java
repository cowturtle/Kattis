class FizzBuzz2
{
    public static void main(String[] args)
    {
        new FizzBuzz2().run();
    }

    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt(), m = sc.getInt();

        int highestScore = 0, score, pos = 1;

        for (int i = 1; i <= n; i++)
        {
            score = 0;
            
            for (int j = 1; j <= m; j++)
            {
                score += check(j, sc.getWord()) ? 1 : 0;
            }

            if (score > highestScore)
            {
                pos = i;
                highestScore = score;
            }
        }

        System.out.println(pos);

        sc.close();
    }

    private boolean check(int num, String actual)
    {
        if (num % 3 == 0 && num % 5 == 0)
        {
            return actual.equals("fizzbuzz");
        }
        else if (num % 3 == 0)
        {
            return actual.equals("fizz");
        }
        else if (num % 5 == 0)
        {
            return actual.equals("buzz");
        }
        else
        {
            return String.valueOf(num).equals(actual);
        }
    }
}