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

class MusicYourWay {
    
    public static void main(String[] args) throws IOException {
        
        class Song {
            String[] attributes;

            public Song(String[] attributes) {
                this.attributes = attributes;
            }

            @Override
            public String toString() {
                return Arrays.toString(this.attributes).replace(",", "").replace("[", "").replace("]", "");
            }

        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String attribIn = br.readLine();
        List<String> attributeTypes = Arrays.asList(attribIn.split("\\s+"));
        int m = Integer.parseInt(br.readLine());
        Song[] songs = new Song[m];
        for (int i = 0; i < m; i++) 
            songs[i] = new Song(br.readLine().split("\\s+"));
        
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int sortIndex = attributeTypes.indexOf(br.readLine());
            Arrays.sort(songs, new Comparator<>() {
                @Override
                public int compare(Song s1, Song s2) {
                    return s1.attributes[sortIndex].compareTo(s2.attributes[sortIndex]);
                }
            });
            out.println(attribIn);
            for (Song s : songs)
                out.println(s);
            out.println();
        }

        out.close();
        br.close();
    }
    
}
