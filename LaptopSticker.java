class LaptopSticker 
{
    public static void main(String[] args)
    {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s");
        int wc = Integer.parseInt(arr[0]);
        int hc = Integer.parseInt(arr[1]);
        int ws = Integer.parseInt(arr[2]);
        int hs = Integer.parseInt(arr[3]);

        if (wc - ws < 2 || hc - hs < 2)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1);
        }

    }
}