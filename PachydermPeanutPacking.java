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

class PachydermPeanutPacking {
    
    public static void main(String[] args) {
        class Point {

            final double x, y;

            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
            
        }
        
        class Box {

            final Point bottomLeft;
            final Point topRight;
            final String type;

            Box(Point bottomLeft, Point topRight, String type) {
                this.bottomLeft = bottomLeft;
                this.topRight = topRight;
                this.type = type;
            }

            boolean isInside(Point p) {
                return bottomLeft.x <= p.x && p.x <= topRight.x 
                        && bottomLeft.y <= p.y && p.y <= topRight.y; 
            }

            boolean isCorrectType(String type) {
                return this.type.equals(type);
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = 0;
        StringBuilder sb = new StringBuilder();
        while ((n = sc.getInt()) != 0) {
            Box[] boxes = new Box[n];
            for (int i = 0; i < n; i++)
                boxes[i] = new Box(new Point(sc.getDouble(), sc.getDouble()), 
                                    new Point(sc.getDouble(), sc.getDouble()), 
                                    sc.getWord());
            int m = sc.getInt();
            while (m-- > 0) {
                Point p = new Point(sc.getDouble(), sc.getDouble());
                String type = sc.getWord();
                String pos = "";
                for (int i = 0; i < n; i++) {
                    if (boxes[i].isInside(p)) {
                        if (boxes[i].isCorrectType(type)) {
                            pos = "correct";
                        } else {
                            pos = boxes[i].type;
                        }
                        break;
                    }
                }
                sb.append(type);
                sb.append(" "); 
                sb.append(pos.equals("") ? "floor" : pos);
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
