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

class VariableArithmetic {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        HashMap<String, Integer> variables = new HashMap<>();
        String input = "";
        while (!(input = br.readLine()).equals("0")) {
            if (input.contains("=")) {
                String[] arr = input.split(" = ");
                variables.put(arr[0], Integer.parseInt(arr[1]));
            } else {
                String[] arr = input.split(" \\+ ");
                List<String> list = new ArrayList<>();
                int sum = 0;
                for (String variable : arr)
                    if (variables.containsKey(variable)) {
                        sum += variables.get(variable);
                    } else if (isNumeric(variable)) {
                        sum += Integer.parseInt(variable);
                    } else {
                        list.add(variable);
                    }
                out.println((sum == 0 ? "" : (sum + (list.size() == 0 ? "" : " + "))) + list.toString().replaceAll("[\\[\\]]", "").replaceAll(",\\s"," + ")); 
            }
        }
        out.close();
        br.close();
    }

    static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
