class Nop
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        String s = sc.getWord();
        int len = s.length();
        int ans = 0, memory = 0, diff = 0;

        for (int i = 0; i < len; i++, memory++)
        {
            if (Character.isUpperCase(s.charAt(i)))
            {
                diff = 0;
                while (memory % 4 != 0)
                {
                    diff++;
                    memory++;
                }
                ans += diff;
            }            
        }

        sc.println(ans);
        
        sc.close();
    }
    public static void main(String[] args)
    {
        new Nop().run();
    }
}