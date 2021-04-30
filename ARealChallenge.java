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

class ARealChallenge {
    
    public static void main(String[] args) {
        new ARealChallenge();
    }

    ARealChallenge() {
        answer();
    }

    void answer() {
        System.out.println(new BigDecimal(new Kattio(System.in).getWord()).sqrt(new MathContext(10)).multiply(new BigDecimal("4")));
    }

}
