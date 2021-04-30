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

class ThankGodItsFriday {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().replaceAll("\\s+", "");
        boolean special = s.equals("29FEB");

        GregorianCalendar gregCal = (GregorianCalendar) GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMM");
        Date date = sdf.parse(s);
        int targetFirstDay = translateToInt(sc.nextLine());
        
        ArrayList<Integer> years = new ArrayList<>();
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.set(2000, 0, 1);
        end.set(2100, 0, 1);
        
        while (start.before(end)) {
            if (start.get(Calendar.DAY_OF_WEEK) == targetFirstDay) 
                if (special) {
                    if (gregCal.isLeapYear(start.get(Calendar.YEAR)))
                        years.add(start.get(Calendar.YEAR));    
                } else {
                    years.add(start.get(Calendar.YEAR));
                }
                
            start.add(Calendar.YEAR, 1);    
        }
                
        if (special) {
            start.set(2000, 2, 0);
        } else {
            start.setTime(date);
        }
        int yes = 0, no = 0;
        for (int year : years) {
            System.out.println(start.getTime());
            start.set(Calendar.YEAR, year);
            if (start.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                yes++;
            } else {
                no++;
            }
        }

        if (yes > 1) {
            if (no > 1) {
                System.out.println("not sure");
            } else {
                System.out.println("TGIF");
            }
        } else {
            System.out.println(":(");
        }
        
        sc.close();
    }

    static int translateToInt(String s) {
        switch(s) {
            case "MON": return Calendar.MONDAY;
            case "TUE": return Calendar.TUESDAY;
            case "WED": return Calendar.WEDNESDAY;
            case "THU": return Calendar.THURSDAY;
            case "FRI": return Calendar.FRIDAY;
            case "SAT": return Calendar.SATURDAY;
            case "SUN": return Calendar.SUNDAY;
            default: return -1;
        }
    }

}
