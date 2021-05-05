import java.io.PrintWriter;
import java.util.Arrays;
import java.util.regex.Pattern;

class SpellingBee
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String letters = sc.getWord();
        String centerLetter = String.valueOf(letters.charAt(0));

        Pattern p = Pattern.compile("^[" + letters + "]{4,}$");

        int n = sc.getInt();

        String s;
        while (n-- > 0)
        {
            s = sc.getWord();
            if (s.contains(centerLetter) && p.matcher(s).matches())
            {
                out.println(s);
            }
        }

        out.close();
        sc.close();
    }
}
