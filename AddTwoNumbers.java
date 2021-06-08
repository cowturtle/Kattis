class AddTwoNumbers
{
    public void run()
    {
        Kattio sc = new Kattio(System.in);
        
        sc.println(sc.getInt() + sc.getInt());

        sc.close();
    }
    public static void main(String[] args)
    {
        new AddTwoNumbers().run();
    }
}