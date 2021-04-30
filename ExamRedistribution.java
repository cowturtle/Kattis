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

class ExamRedistribution {
    
    public static void main(String[] args) {

        class Room implements Comparable<Room> {
            int roomNumber;
            int students;

            Room(int roomNumber, int students) {
                this.roomNumber = roomNumber;
                this.students = students;
            }

            @Override
            public int compareTo(Room r) {
                return r.students - this.students;
            }
            
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), totalStudents = 0;
        Room[] rooms = new Room[n];
        for (int i = 1; i <= n; i++) {
            int students = sc.getInt();
            rooms[i - 1] = new Room(i, students);
            totalStudents += students;
        }
        Arrays.sort(rooms);
        if (totalStudents < rooms[0].students * 2) {
            System.out.println("impossible");
        } else {
            for (int i = 0; i < n; i++)
                System.out.printf("%d ", rooms[i].roomNumber);
        }
        sc.close();
    }
    
}
