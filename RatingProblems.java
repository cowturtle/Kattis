class RatingProblems
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt(), k = sc.getInt(), rem = n - k, total = 0;

        while (k-- > 0)
        {
            total += sc.getInt();
        }

        System.out.printf("%.4f %.4f\n", (total + (-3 * rem)) / (double) n, (total + (3 * rem)) / (double) n);

        sc.close();
    }
}
