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

class SchoolSpirit {
    
    public static void main(String[] args) {
        new SchoolSpirit();
    }

    SchoolSpirit() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] students = new int[n];
        for (int i = 0; i < students.length; i++)
            students[i] = sc.getInt();
        
        double group = groupScores(students);
        double averageG = averageG(students, group);
        System.out.println(group);
        System.out.println(averageG);

        sc.close();        
    }

    double averageG(int[] arr, double group) {
        double averageG = 0;
        for (int i = 0; i < arr.length; i++) {
            int iter = 0;
            double local_averageG = 0;
            for (int j = 0; j < arr.length; j++)
                if (i != j) local_averageG += arr[j] * Math.pow(.8, iter++);
            // int[] tmp = new int[arr.length - 1];
            // for (int j = 0; j < i; j++)
            //     tmp[j] = arr[j];
            // for (int j = i + 1; j < arr.length; j++)
            //     tmp[j - 1] = arr[j];
            // System.out.println(Arrays.toString(tmp));
            averageG += local_averageG / 5.0;
        }
        return averageG / arr.length;
    }

    double groupScores(int[] arr) {
        double group = 0;
        for (int i = 0 ; i < arr.length; i++) 
            group += arr[i] * Math.pow(.8, i);
        return group / 5.0;
    }
    
}
