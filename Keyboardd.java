import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Keyboardd 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(), b = sc.nextLine();
        Set<Character> set = new HashSet<>();

        int i = 0, j = 0, alen = a.length(), blen = b.length();
        char ac, bc;

        while (i < alen && j < blen)
        {
            ac = a.charAt(i);
            bc = b.charAt(j);

            // System.out.printf("%d %s %d %s \n", i, ac, j, bc);

            if (ac == bc)
            {
                i++;
            }
            else
            {                  
                set.add(bc);
            }   
            j++;         
        }

        if (j < blen && b.charAt(j) == a.charAt(i - 1))
        {
            set.add(b.charAt(j));
        }

        for (char c : set)
        {
            System.out.print(c);
        }

        sc.close();
    }
}