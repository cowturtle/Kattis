import java.util.Scanner;

class MethodicMultiplication
{
    public static void main(String[] args)    
    {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLine().chars().filter(ch -> ch == 'S').count();
        
        if (x == 0)
        {
            System.out.println(0);
        }
        else
        {
            long y = sc.nextLine().chars().filter(ch -> ch == 'S').count();

            if (y == 0)
            {
                System.out.println(0);
            }
            else
            {
                long total = x * y;

                StringBuilder sb = new StringBuilder();
                sb.append("0");

                while (total-- > 0)
                {
                    sb.append(")");
                    sb.insert(0, "S(");
                }

                System.out.println(sb.toString());
            }
        }
    }
}

