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

class DigitalDisplay {
    
    public static void main(String[] args) {
        ArrayList<HashMap<Character, String>> alMaps = createMaps();
        StringBuilder sb = new StringBuilder();
        Kattio sc = new Kattio(System.in);
        String s = "end";
        while (!(s = sc.getWord()).equals("end")) {
            char[] arr = s.toCharArray();
            for (HashMap<Character, String> hm : alMaps)
                sb.append(hm.get(arr[0]))
                    .append("  ")
                    .append(hm.get(arr[1]))
                    .append(hm.get(arr[2]))
                    .append(hm.get(arr[3]))
                    .append("  ")
                    .append(hm.get(arr[4]))
                    .append("\n");
            sb.append("\n");
            sb.append("\n");
        }
        sb.append("end");
        System.out.println(sb.toString());
        sc.close();
    }

    static ArrayList<HashMap<Character, String>> createMaps() {
        HashMap<Character, String> firstLine = new HashMap<>();
        HashMap<Character, String> secondLine = new HashMap<>();
        HashMap<Character, String> thirdLine = new HashMap<>();
        HashMap<Character, String> fourthLine = new HashMap<>();
        HashMap<Character, String> fifthLine = new HashMap<>();
        HashMap<Character, String> sixthLine = new HashMap<>();
        HashMap<Character, String> seventhLine = new HashMap<>();
        writeFirst(firstLine);
        writeSecond(secondLine);
        writeThird(thirdLine);
        writeFourth(fourthLine);
        writeFifth(fifthLine);
        writeSixth(sixthLine);
        writeSeventh(seventhLine);
        ArrayList<HashMap<Character, String>> al = new ArrayList<>();
        al.add(firstLine);
        al.add(secondLine);
        al.add(thirdLine);
        al.add(fourthLine);
        al.add(fifthLine);
        al.add(sixthLine);
        al.add(seventhLine);
        return al;
    }

    static void writeFirst(HashMap<Character, String> hmap) {
        hmap.put('0', "+---+");
        hmap.put('1', "    +");
        hmap.put('2', "+---+");
        hmap.put('3', "+---+");
        hmap.put('4', "+   +");
        hmap.put('5', "+---+");
        hmap.put('6', "+---+");
        hmap.put('7', "+---+");
        hmap.put('8', "+---+");
        hmap.put('9', "+---+");
        hmap.put(':', "     ");
    }

    static void writeSecond(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "    |");
        hmap.put('3', "    |");
        hmap.put('4', "|   |");
        hmap.put('5', "|    ");
        hmap.put('6', "|    ");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "|   |");
        hmap.put(':', "     ");
    }

    static void writeThird(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "    |");
        hmap.put('3', "    |");
        hmap.put('4', "|   |");
        hmap.put('5', "|    ");
        hmap.put('6', "|    ");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "|   |");
        hmap.put(':', "  o  ");
    }

    static void writeFourth(HashMap<Character, String> hmap) {
        hmap.put('0', "+   +");
        hmap.put('1', "    +");
        hmap.put('2', "+---+");
        hmap.put('3', "+---+");
        hmap.put('4', "+---+");
        hmap.put('5', "+---+");
        hmap.put('6', "+---+");
        hmap.put('7', "    +");
        hmap.put('8', "+---+");
        hmap.put('9', "+---+");
        hmap.put(':', "     ");
    }

    static void writeFifth(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "|    ");
        hmap.put('3', "    |");
        hmap.put('4', "    |");
        hmap.put('5', "    |");
        hmap.put('6', "|   |");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "    |");
        hmap.put(':', "  o  ");
    }

    static void writeSixth(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "|    ");
        hmap.put('3', "    |");
        hmap.put('4', "    |");
        hmap.put('5', "    |");
        hmap.put('6', "|   |");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "    |");
        hmap.put(':', "     ");
    }

    static void writeSeventh(HashMap<Character, String> hmap) {
        hmap.put('0', "+---+");
        hmap.put('1', "    +");
        hmap.put('2', "+---+");
        hmap.put('3', "+---+");
        hmap.put('4', "    +");
        hmap.put('5', "+---+");
        hmap.put('6', "+---+");
        hmap.put('7', "    +");
        hmap.put('8', "+---+");
        hmap.put('9', "+---+");
        hmap.put(':', "     ");
    }
    
}
