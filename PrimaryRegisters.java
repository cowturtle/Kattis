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

class PrimaryRegisters {
    
    public static void main(String[] args) {
        new PrimaryRegisters();
    }

    PrimaryRegisters() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int[] registers = new int[] {2, 3, 5, 7, 11, 13, 17, 19};
        int[] read = new int[] {sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt()};
        int total = registers[0] - 1 - read[0];
        for (int i = 1; i < registers.length; i++) 
            total += (registers[i] - 1 - read[i]) * fakeFactorial(i - 1, registers);
        System.out.println(total);
        sc.close();
    }

    int fakeFactorial(int i, int[] registers) {
        int x = 1;
        for (int j = 0; j <= i; j++)
            x *= registers[j];
        return x;
    }

}
