import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class DamagedEquation
{
    public static void main(String[] args)
    {
        int[] arr = Arrays.stream(new Scanner(System.in).nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        char[] ops = new char[] {'*', '+', '-', '/'};

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < ops.length; i++)
        {
            for (int j = 0; j < ops.length; j++)
            {
                int leftRes = 0;
                int rightRes = 0;

                if (ops[i] == '*')
                {
                    leftRes = arr[0] * arr[1];
                }
                else if (ops[i] == '+')
                {
                    leftRes = arr[0] + arr[1];
                }
                else if (ops[i] == '-')
                {
                    leftRes = arr[0] - arr[1];
                }
                else if (ops[i] == '/')
                {
                    if (arr[1] == 0)
                    {
                        leftRes = Integer.MIN_VALUE;
                    }
                    else
                    {
                        leftRes = arr[0] / arr[1];
                    }                                            
                }

                if (ops[j] == '*')
                {
                    rightRes = arr[2] * arr[3];
                }
                else if (ops[j] == '+')
                {
                    rightRes = arr[2] + arr[3];
                }
                else if (ops[j] == '-')
                {
                    rightRes = arr[2] - arr[3];
                }
                else if (ops[j] == '/')
                {
                    if (arr[3] == 0)
                    {
                        rightRes = Integer.MIN_VALUE;
                    }
                    else
                    {
                        rightRes = arr[2] / arr[3];
                    }                                            
                }

                if (rightRes == leftRes && rightRes != Integer.MIN_VALUE)
                {
                    ans.add(arr[0] + " " + ops[i] + " " + arr[1] + " = " + arr[2] + " " + ops[j] + " " + arr[3]);
                }
            }            
        }

        if (ans.isEmpty())
        {
            System.out.println("problems ahead");
        }
        else
        {
            for (String an : ans)
            {
                System.out.println(an);
            }
        }        
    }
}
