class Reverse 
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.getInt();
        }

        for (int i = n - 1; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}