class FromAToB
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        long a = sc.getLong();
        long b = sc.getLong();

        if (b > a)
        {
            System.out.println(b - a);
        }
        else if (a == b)
        {
            System.out.println(0);
        }
        else
        {
            int x = 0;

            while (a > b)
            {
                if (a % 2 != 0)
                {
                    a++;
                    x++;
                }
                a /= 2;
                x++;
            }

            x += b - a;

            System.out.println(x);
        }

        sc.close();
    }
}
