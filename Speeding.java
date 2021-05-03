class Speeding
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt() - 1;

        long max = 0L;
        long currT = sc.getInt(), currD = sc.getInt(), prevT, prevD, diffT, diffD;
        
        for (int i = 0; i < n; i++)
        {
            prevT = currT;
            prevD = currD;

            currT = sc.getLong();
            currD = sc.getLong();

            diffT = currT - prevT;
            diffD = currD - prevD;

            max = Math.max(max, diffD / diffT);
        }

        System.out.println(max);

        sc.close();
    }
}