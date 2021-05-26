class BrokenCalculator
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);        

        int n = sc.getInt();

        long prev = 1L;

        while (n-- > 0)
        {
            prev = operate(sc.getLong(), sc.getChar(), sc.getLong(), prev);
            sc.write(String.valueOf(prev));
            sc.write("\n");
        }

        sc.close();
    }

    public long operate(long a, char c, long b, long prev)
    {
        switch (c) {
            case '+':
                return addition(a, b, prev);
            case '-':
                return subtraction(a, b, prev);
            case '*':
                return multiplication(a, b);
            case '/':
                return division(a);
            default:
                return 0L;
        }
    }

    public long addition(long a, long b, long prev)
    {
        return a + b - prev;
    }

    public long subtraction(long a, long b, long prev)
    {
        return (a - b) * prev; 
    }

    public long multiplication(long a, long b)
    {
        return (a * b) * (a * b); 
    }

    public long division(long a)
    {
        return (a % 2 == 0 ? a : a + 1) / 2;
    }

    public static void main(String[] args)
    {
        new BrokenCalculator().run();
    }
}
