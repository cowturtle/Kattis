class Arrangement
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt(), m = sc.getInt(), r = m % n, q = m / n;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < q; j++)
            {
                sb.append("*");
            }
            if (r > 0)
            {
                r--;
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
        
        sc.close();
    }
}