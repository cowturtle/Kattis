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

class HorrorFilmNight {

    private static final int MAX_DAYS = 1_000_000;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        boolean[] emma = new boolean[MAX_DAYS], marcos = new boolean[MAX_DAYS];
        int k = sc.getInt(), films = 0;
        while (k-- > 0) 
            emma[sc.getInt()] = true;
        k = sc.getInt();
        while (k-- > 0) 
            marcos[sc.getInt()] = true;
        boolean eLike = true, mLike = true;
        for (int i = 0; i < MAX_DAYS; i++) 
            if ((emma[i] && marcos[i]) || (eLike && marcos[i]) || (mLike && emma[i])) {
                eLike = emma[i];
                mLike = marcos[i];
                films++;
            }
        System.out.println(films);
        sc.close();
    }

}
