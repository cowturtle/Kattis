class PowersOf2Easy
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);
        
        int n = sc.getInt(), e = (int) Math.pow(2, sc.getInt()), res = 0;
        String x = String.valueOf(e);

        for (int i = 0; i <= n; i++)
        {
            if (String.valueOf(i).contains(x))
            {
                res++;
            }
        }

        sc.println(res);

        sc.close();
    }
    public static void main(String[] args)
    {
        new PowersOf2Easy().run();
    }    
}