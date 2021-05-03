class JumboJavelin 
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();
        int total = 1;

        while (n-- > 0)
        {
            total += sc.getInt() - 1;
        }

        System.out.println(total);

        sc.close();
    }    
}
