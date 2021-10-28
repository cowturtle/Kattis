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

class SMIL
{
    public static void main(String[] args)
    {
        new SMIL();
    }

    SMIL()
    {
        answer();
    }

    void answer()
    {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String in = sc.getWord();
        boolean correct;
        char c;
        int len = in.length();

        char[][] smiles = new char[][]{
                {':', ')'},
                {';', ')'},
                {':', '-', ')'},
                {';', '-', ')'}
        };

        for (int i = 0; i < len; i++)
        {
            for (char[] smile : smiles)
            {
                correct = true;
                for (int j = i; j < len && j - i < smile.length; j++)
                {
                    c = in.charAt(j);
                    if (c != smile[j - i])
                    {
                        correct = false;
                        break;
                    }
                }

                if (correct && len - i >= smile.length)
                {
                    out.println(i);
                    break;
                }
            }
        }

        out.close();
        sc.close();
    }
}
