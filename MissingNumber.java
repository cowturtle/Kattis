class MissingNumber
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);
                
        int n = sc.getInt();
        String s = sc.getWord();
        int len = s.length();

        for (int i = 0, x = 1; x <= n; x++)
        {
            if (i == len)
            {
                System.out.println(x);
            }
            else if (x < 10)
            {
                if (s.charAt(i) - 48 != x)
                {
                    System.out.println(x);
                    break;
                }
                i += 1;
            }
            else
            {
                if (Integer.parseInt(s.substring(i, i + 2)) != x)
                {
                    System.out.println(x);
                    break;
                }
                i += 2;
            }
        }

        sc.close();
    }

    public static void main(String[] args)
    {
        new MissingNumber().run();
    }   
}
