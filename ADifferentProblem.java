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
// The jshell testing will fail. lazy to simulate EOF
class ADifferentProblem {
    public static void main(String[] args) {
        new ADifferentProblem();
    }

    ADifferentProblem() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        ArrayList<BigInteger> al = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] sarr = sc.nextLine().split(" ");
            al.add(new BigInteger(sarr[0]).subtract(new BigInteger(sarr[1])).abs());
        }
        al.stream().forEach(System.out::println);
        sc.close();
    }
}
