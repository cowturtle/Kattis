import java.io.PrintWriter;

class Soundex
{
    public void run()
    {        
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        String s;
        char curr, prev;
        while ((s = sc.getWord()) != null)
        {
            curr = '\u0000';
            prev = '\u0000';

            for (char c : s.toCharArray())
            {
                prev = curr;
                curr = alike(c);
                if (curr == '0') continue;
                if (prev == '\u0000' || curr != prev)
                {
                    out.print(curr);
                }
            }    
            out.println();        
        }

        out.close();
        sc.close();
    }

    private char alike(char c)
    {
        switch(c) {
            case 'B':
            case 'F':
            case 'P':
            case 'V':
                return '1';
            case 'C':
            case 'G':
            case 'J':
            case 'K':
            case 'Q':
            case 'S':
            case 'X':
            case 'Z':
                return '2';
            case 'D':
            case 'T':
                return '3';
            case 'L':
                return '4';
            case 'M':
            case 'N':
                return '5';
            case 'R':
                return '6';
            default :
                return '0';
        }
    }

    public static void main(String[] args)
    {
        new Soundex().run();
    }
}

