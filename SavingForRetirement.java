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

class SavingForRetirement {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bobAge = arr[0];
        int bobRetire = arr[1];
        int bobSave = arr[2];
        int bobMoney = (bobRetire - bobAge) * bobSave;
        int aliceAge = arr[3];
        int aliceRetire = aliceAge;
        int aliceSave = arr[4];
        int aliceMoney = 0;
        while (aliceMoney <= bobMoney) 
            aliceMoney = (++aliceRetire - aliceAge) * aliceSave; 
        System.out.println(aliceRetire);
    }
    
}
