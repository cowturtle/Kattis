class NoThanks
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt(), max = 90_001, i;
        int largest = 0;
        int sum = 0;
        boolean [] arr = new boolean[max];

        while (n-- > 0)
        {
            i = sc.getInt();
            largest = Math.max(largest, i);
            arr[i] = true;
        }

        for (i = largest; i >= 0; i--)
        {
            if (i < max && !arr[i] && arr[i + 1])
            {
                sum += i + 1;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
