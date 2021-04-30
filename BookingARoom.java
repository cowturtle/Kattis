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

class BookingARoom {
    
    public static void main(String[] args) {
        new BookingARoom();
    }

    BookingARoom() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        boolean[] booked = new boolean[sc.getInt() + 1];
        int n = sc.getInt(), room = -1;
        while (n-- > 0)
            booked[sc.getInt()] = true;
        for (int i = 1; i < booked.length; i++)
            if (!booked[i]) {
                room = i; 
                break;
            }
        System.out.println(room == - 1 ? "too late" : room);
        sc.close();
    }
    
}
