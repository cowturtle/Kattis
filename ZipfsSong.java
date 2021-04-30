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

class ZipfsSong {
    
    public static void main(String[] args) {

        // 0.65s
        class Song implements Comparable<Song> {
            
            String title;
            int pos;
            long quality;

            Song(long timesPlayed, int i, String title) {
                this.title = title;
                this.pos = i;
                this.quality = -1 * i * timesPlayed;
            }

            @Override
            public int compareTo(Song s) {
                if (this.quality == s.quality) {
                    return this.pos - s.pos;
                }
                return Long.valueOf(this.quality).compareTo(Long.valueOf(s.quality));
            }

            @Override
            public String toString() {
                return this.title;
            }
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        ArrayList<Song> album = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
            album.add(new Song(sc.getLong(), i, sc.getWord()));
        Collections.sort(album);
        for (int i = 0; i < m; i++)
            System.out.println(album.get(i));
        sc.close();

        // not working :(
        // class Song implements Comparable<Song> {

        //     int index;
        //     Long quality;

        //     Song(int index, long timesPlayed) {
        //         this.index = index;
        //         this.quality = Long.valueOf(-1 * index * timesPlayed);
        //     }

        //     @Override
        //     public int compareTo(Song s) {
        //         if (this.quality == s.quality) {
        //             return this.index - s.index;
        //         }
        //         return this.quality.compareTo(s.quality);
        //     }
        // }

        // Kattio sc = new Kattio(System.in);
        // int n = sc.getInt(), m = sc.getInt();
        // SortedMap<Song, String> sm = new TreeMap<>();
        // for (int i = 1; i <= n; i++)
        //     sm.put(new Song(i, sc.getLong()), sc.getWord());
        // Iterator i = sm.entrySet().iterator();
        // while (i.hasNext() && m-- > 0) 
        //     System.out.println(((Entry) i.next()).getValue());
        // sc.close();
    }
    
}
