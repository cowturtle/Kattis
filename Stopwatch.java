class Stopwatch 
{    
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();

        if (n % 2 == 0)
        {
            long runTime = 0L, read = 0L;
            for (int i = 0; i < n; i++)
            {
                read = sc.getLong();
                if (i % 2 == 0)
                {
                    runTime -= read;
                }
                else
                {
                    runTime += read;
                }
            }
            System.out.println(runTime);
        }
        else
        {
            System.out.println("still running");
        }        

        sc.close();
    }

}