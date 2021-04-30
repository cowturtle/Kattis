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

class Spavanac {
    Spavanac() {
        answer();
    }

    void answer() {
        String[] s = new Scanner(System.in).nextLine().split(" ");
        int hours = Integer.parseInt(s[0]), minutes = Integer.parseInt(s[1]);
        Clock c = new Clock(hours, minutes);
        c.minusFourFive();
        System.out.println(c);
    }
}

class Clock {
    int hours;
    int minutes;

    Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void minusFourFive() {
        this.minutes -= 45;
        if (this.minutes < 0) {
            this.minutes += 60;
            this.hours -= 1;
            if (this.hours < 0) {
                this.hours += 24;
            }
        }
    }

    @Override
    public String toString() {
        return this.hours + " " + this.minutes;
    }
}
