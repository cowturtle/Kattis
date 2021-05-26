class LindenMayorSystem 
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt(), m = sc.getInt();
        String s;

        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++)
        {
            arr[i][0] = sc.getWord();
            sc.getWord();
            arr[i][1] = sc.getWord();
        }

        s = sc.getWord();

        while (m-- > 0)
        {
            s = replace(s, arr);
        }

        System.out.println(s);

        sc.close();
    }

    private String replace(String s, String[][] arr)
    {
        int n = s.length();
        boolean added = false;
        StringBuilder sb = new StringBuilder(100);
        char c;

        for (int i = 0; i < n; i++)
        {
            added = false;
            c = s.charAt(i);
            for (String[] ar : arr)
            {
                if (c == ar[0].charAt(0))
                {
                    sb.append(ar[1]);
                    added = true;
                    break;
                }
            }                 
            
            if (!added)
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {
        new LindenMayorSystem().run();
    }
}
