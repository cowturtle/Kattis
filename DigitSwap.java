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

class DigitSwap
{
    public static void main(String[] args)
    {
        new DigitSwap();
    }

    DigitSwap()
    {
        answer();
    }

    void answer()
    {
        Kattio sc = new Kattio(System.in);

        String in = sc.getWord();
        System.out.println(in.charAt(1) + "" + in.charAt(0));

        sc.close();
    }
}