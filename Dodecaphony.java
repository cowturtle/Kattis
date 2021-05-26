class Dodecaphony
{
    private boolean t;
    private boolean i;
    private boolean r;

    public Dodecaphony()
    {
        this.t = true;
        this.i = true;
        this.r = true;
    }

    public void run()
    {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();

        int[] original = new int[n];
        int[] inversion = new int[n];
        int[] retrograde = new int[n];
        int[] altered = new int[n];
        int x;

        for (int i = 0; i < n; i++)
        {
            x = convert(sc.getWord());
            
            original[i] = x;

            if (i == 0)
            {
                inversion[i] = x;
            }
            else
            {
                inversion[i] = wrap(inversion[0] - (x - inversion[0]));
            }
            
            retrograde[n - 1 - i] = x;
        }
        
        for (int i = 0; i < n; i++)
        {
            x = convert(sc.getWord());

            altered[i] = x;

            if (this.t || this.i || this.r)
            {
                if (this.t 
                    && i > 0 
                    && original[i] - altered[i] != original[i - 1] - altered[i - 1])
                {
                    this.t = false;
                }

                if (this.i && altered[i] != inversion[i])
                {
                    this.i = false;
                } 

                if (this.r && altered[i] != retrograde[i])
                {
                    this.r = false;
                } 
            }
            else
            {
                break;
            }
        }

        printResult();        
    }

    private void printResult()
    {
        if (this.t)
        {
            System.out.println("Transposition");
        }
        else if (this.i)
        {
            System.out.println("Inversion");
        }
        else if (this.r)
        {
            System.out.println("Retrograde");
        }
        else
        {
            System.out.println("Nonsense");
        }
    }

    private int wrap(int x)
    {
        if (x < 0)
        {
            return 12 + x;
        }
        else if (x > 11)
        {
            return x - 12;
        }
        return x;
    }

    private int convert(String s)
    {
        switch (s) {
            case "C":
                return 0;
            case "C#":
                return 1;
            case "D":
                return 2;
            case "D#":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            case "F#":
                return 6;
            case "G":
                return 7;
            case "G#":
                return 8;
            case "A":
                return 9;
            case "A#":
                return 10;
            case "B":
                return 11;
            default: 
                return -1;
        }
    }

    public static void main(String[] args)
    {
        new Dodecaphony().run(); 
    }
}

