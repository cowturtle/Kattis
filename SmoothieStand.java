class SmoothieStand
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int k = sc.getInt(), r = sc.getInt(), i, sales = 0, count;
        int[] ingredients = new int[k];

        for (i = 0; i < k; i++)
        {
            ingredients[i] = sc.getInt();
        }

        while (r-- > 0)
        {
            count = 100_000;
            for (i = 0; i < k; i++)
            {
                try
                {
                    count = Math.min(count, ingredients[i] / sc.getInt());
                }
                catch (ArithmeticException ex) { }                
            }

            sales = Math.max(sales, sc.getInt() * count);
        }

        System.out.println(sales);

        sc.close();
    }
    public static void main(String[] args)
    {
        new SmoothieStand().run();
    }
}
