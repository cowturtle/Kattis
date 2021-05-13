class Majstor
{
    public static void main(String[] args)
    {
        // S P or R

        Kattio sc = new Kattio(System.in);

        char[] sven = new char[sc.getInt()];
        String tmp = sc.getWord();
        for (int i = 0; i < sven.length; i++)
        {
            sven[i] = tmp.charAt(i);
        }

        int[][] max = new int[sven.length][3];

        int n = sc.getInt();

        char friend;

        while (n-- > 0)
        {
            tmp = sc.getWord();
            for (int i = 0; i < sven.length; i++)
            {
                friend = tmp.charAt(i);                    
                if (friend == 'S')
                {
                    max[i][0]++;
                }
                else if (friend == 'P')
                {
                    max[i][1]++;
                }
                else if (friend == 'R')
                {
                    max[i][2]++;
                }   
            }
        }

        int actual = 0, possible = 0;
        int ifScissor, ifPaper, ifRock, ifMax;
        char svenSymbol;

        for (int i = 0; i < max.length; i++)
        {            
            svenSymbol = sven[i];

            ifMax = 0;
            ifScissor = (max[i][0] * 1) + (max[i][1] * 2) + (max[i][2] * 0);
            ifPaper = (max[i][0] * 0) + (max[i][1] * 1) + (max[i][2] * 2);
            ifRock = (max[i][0] * 2) + (max[i][1] * 0) + (max[i][2] * 1);

            ifMax = Math.max(ifMax, ifScissor);
            ifMax = Math.max(ifMax, ifPaper);
            ifMax = Math.max(ifMax, ifRock);

            possible += ifMax;

            if (svenSymbol == 'S')
            {
                actual += ifScissor;
            }
            else if (svenSymbol == 'P')
            {
                actual += ifPaper;
            }
            else if (svenSymbol == 'R')
            {
                actual += ifRock;
            }
        }

        System.out.println(actual);
        System.out.println(possible);

        sc.close();
    }
}