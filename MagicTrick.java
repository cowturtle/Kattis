class MagicTrick 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[256];        
        boolean b = false;
        for (char c : new java.util.Scanner(System.in).nextLine().toCharArray())
        {
            if (arr[c] == 1)
            {
                b = true;
                break;                
            }
            arr[c]++;
        }

        System.out.println(b ? 0 : 1);
    }

}
