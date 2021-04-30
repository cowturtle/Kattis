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

class FBIUniversalControlNumbers {
    
    private static final HashMap<Character, Character> confusionMap = new HashMap<>();
    private static final HashMap<Character, Integer> easyMap = new HashMap<>();
    private static final int[] computation = new int[]{2, 4, 5, 7, 8, 10, 11, 13};

    public static void main(String[] args) {

        confusionMap.put('B','8');
        confusionMap.put('G','C');
        confusionMap.put('I','1');
        confusionMap.put('O','0');
        confusionMap.put('Q','0');
        confusionMap.put('S','6');
        confusionMap.put('U','Y');
        confusionMap.put('Y','V');
        confusionMap.put('Z','2');
        
        easyMap.put('0', 0);
        easyMap.put('1', 1);
        easyMap.put('2', 2);
        easyMap.put('3', 3);
        easyMap.put('4', 4);
        easyMap.put('5', 5);
        easyMap.put('6', 6);
        easyMap.put('7', 7);
        easyMap.put('8', 8);
        easyMap.put('9', 9);
        easyMap.put('A', 10); 
        easyMap.put('C', 11);
        easyMap.put('D', 12);
        easyMap.put('E', 13);
        easyMap.put('F', 14);
        easyMap.put('H', 15);
        easyMap.put('J', 16);
        easyMap.put('K', 17);
        easyMap.put('L', 18);
        easyMap.put('M', 19);
        easyMap.put('N', 20);
        easyMap.put('P', 21);
        easyMap.put('R', 22);
        easyMap.put('T', 23);
        easyMap.put('V', 24);
        easyMap.put('W', 25);
        easyMap.put('X', 26);

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(sc.getInt()).append(" ");
            char[] arr = sc.getWord().toCharArray();
            for (int i = 0; i < arr.length; i++) 
                arr[i] = confusionMap.containsKey(arr[i]) ? confusionMap.get(arr[i]) : arr[i];
            int checkSum = 0;
            for (int i = 0; i < arr.length - 1; i++) 
                checkSum += easyMap.get(arr[i]) * computation[i];
            checkSum %= 27;
            if (checkSum == easyMap.get(arr[arr.length - 1])) {
                long decimal = 0;
                for (int i = arr.length - 1; i > 0 ; i--) 
                    decimal += Math.pow(27, arr.length - 1 - i) * easyMap.get(arr[i - 1]);                   
                sb.append(decimal);
            } else {
                sb.append("Invalid");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
