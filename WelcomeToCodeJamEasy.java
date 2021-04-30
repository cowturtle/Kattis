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

class WelcomeToCodeJamEasy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        char[] target = "welcome to code jam".toCharArray();
        for (int i = 1; i <= n; i++)
            out.printf("Case #%d: %s\n", i, makeNice(play(br.readLine(), target, 0)));
        out.close();
        br.close();
    }

    static String makeNice(int x) {
        if (x == 0) return "0000";
        int y = x, c = 0;
        while (x > 0) {
            x /= 10;
            c++;
        }
        return "0".repeat(4 - c) + y;
    }

    static int play(String input, char[] target, int index) {
        int count = 0;
        if (index < target.length - 1) {
            for (int i = 0; i < input.length(); i++)
                if (input.charAt(i) == target[index])
                    count += play(input.substring(i, input.length()), target, index + 1);
        } else {
            for (char c : input.toCharArray())
                count += c == 'm' ? 1 : 0; // if it ends with 'm', it is a possible end
        }
        return count;
    }

}
