class EchoEchoEcho {
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        String s = sc.getWord();
        int len = s.length();

        for (int i = 0; i < 3; i++)
        {
            if (i > 0)
            {
                sc.print(" ");
            }
            for (int j = 0; j < len; j++)
            {
                sc.print(s.charAt(j));
            }            
        }

        sc.close();
    }
    public static void main(String[] args)
    {
        new EchoEchoEcho().run();
    }    
}
