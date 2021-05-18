import java.io.PrintWriter;

class SnapperChainEasy
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int t = sc.getInt(), n, k, oneround, firstround;

        for (int i = 1; i <= t; i++)
        {
            n = sc.getInt();
            k = sc.getInt();

            oneround = (int) Math.pow(2, n);
            firstround = oneround - 1;

            out.printf("Case #%d: %s\n", i, k >= firstround && (k - firstround) % oneround == 0 ? "ON" : "OFF");            
        }

        out.close();
        sc.close();
    }
    public static void main(String[] args)
    {
        new SnapperChainEasy().run();
    }
}
