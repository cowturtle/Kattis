class PolynomialMultiplication1
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int t = sc.getInt(), n1, n2, n3, i, j;
        int[] arr1, arr2, arr3;        

        while (t-- > 0)
        {
            n1 = sc.getInt();
            arr1 = new int[n1 + 1];
            for (i = 0; i < n1 + 1; i++)
            {
                arr1[i] = sc.getInt();
            }

            n2 = sc.getInt();
            arr2 = new int[n2 + 1];

            n3 = n1 + n2;
            arr3 = new int[n3 + 1];

            for (i = 0; i < n2 + 1; i++)
            {
                arr2[i] = sc.getInt();
                
                for (j = i; j < n1 + 1 + i; j++)
                {
                    arr3[j] += arr1[j - i] * arr2[i];
                }
            }

            sc.printf("%d\n", n3);
            for (int a : arr3)
            {
                sc.printf("%d ", a);
            }
            sc.println();
        }

        sc.close();
    }
    public static void main(String[] args)
    {
        new PolynomialMultiplication1().run();
    }
}