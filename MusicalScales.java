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

class MusicalScales {
    
    public static void main(String[] args) {
        new MusicalScales();
    }

    MusicalScales() {
        answer();
    }

    static final String[] MUSICAL_NOTES 
        = new String[] {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", 
                        "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};     

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> scales = buildScales();       
        int n = sc.getInt();
        HashSet<String> set = new HashSet<>();
        while (n-- > 0) {
            set.add(sc.getWord());
        }
        boolean add = true;
        for (ArrayList<String> al : scales) {
            for (String s : set) 
                if (!al.contains(s)) add = false;
            if (add) sb.append(al.get(0)).append(" ");
            add = true;
        }
         
        System.out.println(sb.length() == 0 ? "none" : sb.toString().trim());        
        sc.close();
    }

    ArrayList<ArrayList<String>> buildScales() {
        ArrayList<ArrayList<String>> scales = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < 12; i++) {
            ArrayList<String> scale = new ArrayList<>();
            // tone, tone, semitone, tone, tone, tone, semitone
            scale.add(MUSICAL_NOTES[i]);
            scale.add(MUSICAL_NOTES[i + 2]);
            scale.add(MUSICAL_NOTES[i + 4]);
            scale.add(MUSICAL_NOTES[i + 5]);
            scale.add(MUSICAL_NOTES[i + 7]);
            scale.add(MUSICAL_NOTES[i + 9]);
            scale.add(MUSICAL_NOTES[i + 11]);
            scale.add(MUSICAL_NOTES[i + 12]);
            scales.add(scale);
        }
        return scales;
    }
}
