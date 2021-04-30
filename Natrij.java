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

class Natrij {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int current = Integer.parseInt(sc.nextLine().replaceAll(":", ""));
        int explode = Integer.parseInt(sc.nextLine().replaceAll(":", ""));
        if (explode / 10000 < current / 10000) explode += 240000;
        int hours = (explode / 10000) - (current / 10000);
        int minutes = ((explode % 10000) / 100) - ((current % 10000) / 100);
        int seconds = (explode % 100) - (current % 100);
        if (seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }
        if (minutes < 0) {
            minutes += 60;
            hours -= 1;
        }        
        if (hours == 0 && minutes == 0 && seconds == 0) hours = 24;
        System.out.printf("%s:%s:%s", 
                hours < 10 ? "0" + hours : hours, 
                minutes < 10 ? "0" + minutes: minutes, 
                seconds < 10 ? "0" + seconds : seconds);
        sc.close();
    }
    
}
