import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.text.*;

/*
 * @author Theodoric Keith Lim
 */

class TwoSum
{
    public static void main(String[] args)
    {
        new TwoSum();
    }

    TwoSum()
    {
        answer();
    }

    void answer()
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String in = sc.nextLine();

        out.println(
                Arrays.stream(
                                in.split("\\s+"))
                        .map(x -> Integer.parseInt(x))
                        .reduce(0, (x, y) -> x + y)
                        .intValue());

        out.close();
        sc.close();
    }
}
