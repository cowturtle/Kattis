class SortTwoNumbers
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int x = sc.getInt(), y = sc.getInt();

        if (x < y)
        {
            sc.printf("%d %d\n", x, y);
        }
        else
        {
            sc.printf("%d %d\n", y, x);
        }        

        sc.close();
    }
    public static void main(String[] args)
    {
        new SortTwoNumbers().run();
    }
}