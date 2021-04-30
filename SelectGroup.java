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

class SelectGroup {

    private static final Map<String, Set<String>> groups = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            String[] cmd = s.split(" ");
            if (cmd[0].equals("group")) {
                Set<String> set = new TreeSet<>();
                for (int i = 3; i < cmd.length; i++)
                    set.add(cmd[i]);
                groups.put(cmd[1], set);
            } else {
                out.println(evaluate(Arrays.stream(cmd).collect(Collectors.toList()), 0).toString().replaceAll("[\\[\\],]", ""));
            }
        }
        out.close();
        br.close();
    }

    static Set<String> evaluate(List<String> cmd, int i) {
        String curr = cmd.get(i);
        if (curr.equals("union") || curr.equals("intersection") || curr.equals("difference")) {
            char c = curr.charAt(0);
            Set<String> result = null;
            if (c == 'u') {
                result = union(evaluate(cmd, i + 1), evaluate(cmd, i + 2));
            } else if (c == 'i') {
                result = intersection(evaluate(cmd, i + 1), evaluate(cmd, i + 2));
            } else {
                result = difference(evaluate(cmd, i + 1), evaluate(cmd, i + 2));
            }
            cmd.remove(i);
            cmd.remove(i);
            return result;
        } 
        return groups.get(cmd.get(i));
    }

    static Set<String> union(Set<String> s1, Set<String> s2) {
        Set<String> set = new TreeSet<>(s1);
        set.addAll(s2);
        return set;
    }

    static Set<String> intersection(Set<String> s1, Set<String> s2) {
        Set<String> set = new TreeSet<>(s1);
        set.retainAll(s2);
        return set;
    }

    static Set<String> difference(Set<String> s1, Set<String> s2) {
        Set<String> set = new TreeSet<>(s1);
        set.removeAll(s2);
        return set;
    }

}
