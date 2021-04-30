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

class BattleSimulation {
    
    public static void main(String[] args) {
        new BattleSimulation();
    }

    BattleSimulation() {
        answer();
    }

    void answer() {
        System.out.println(
            new java.util.Scanner(System.in).nextLine()
                .replaceAll("RBL|RLB|BLR|BRL|LRB|LBR", "C")
                .replaceAll("R", "S")
                .replaceAll("B", "K")
                .replaceAll("L", "H"));
    }
    
}
