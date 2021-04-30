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

class FerryLoading3 {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int c = sc.getInt();
        while (c-- > 0) {
            int capacity = sc.getInt(), travel = sc.getInt(), cars = sc.getInt();
            ArrayDeque<Integer> leftBank = new ArrayDeque<>();
            ArrayDeque<Integer> rightBank = new ArrayDeque<>();
            int[] carArr = new int[cars];
            for (int i = 0; i < cars; i++) {
                int arrival = sc.getInt();
                String bank = sc.getWord();
                if (bank.equals("left")) {
                    leftBank.add(arrival); 
                    leftBank.add(i);
                } else {
                    rightBank.add(arrival);
                    rightBank.add(i);
                }
                
            }

            int currTime = 0;
            boolean left = true;
            while (!leftBank.isEmpty() || !rightBank.isEmpty()) {
                int leftFirst = leftBank.isEmpty() ? Integer.MAX_VALUE : leftBank.peek();
                int rightFirst = rightBank.isEmpty() ? Integer.MAX_VALUE : rightBank.peek();
                int currCap = 0;
                if (left && leftFirst <= currTime) {
                    while (!leftBank.isEmpty() && leftBank.peek() <= currTime && currCap < capacity) {
                        leftBank.poll();
                        carArr[leftBank.poll()] = currTime + travel;
                        currCap++;
                    }     
                    left = !left;
                    currTime += travel;
                } else if (!left && rightFirst <= currTime) {
                    while (!rightBank.isEmpty() && rightBank.peek() <= currTime && currCap < capacity) {
                        rightBank.poll();                
                        carArr[rightBank.poll()] = currTime + travel;        
                        currCap++;
                    }
                    left = !left;
                    currTime += travel;
                } else if (leftFirst < rightFirst) {
                    currTime = currTime < leftFirst ? leftFirst : currTime;
                    if (!left) {
                        left = !left;
                        currTime += travel;
                    }
                } else if (rightFirst < leftFirst) {
                    currTime = currTime < rightFirst ? rightFirst : currTime;
                    if (left) {
                        left = !left;
                        currTime += travel;
                    }
                } else {
                    currTime = currTime < leftFirst ? leftFirst : currTime;
                } 
            }
            for (int i : carArr)
                sb.append(i).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}
