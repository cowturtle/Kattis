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

class ScalingRecipes {
    
    public static void main(String[] args) {

        class Ingredient {
            String name;
            double weight;
            double percentage;

            public Ingredient(String name, double weight, double percentage) {
                this.name = name;
                this.weight = weight;
                this.percentage = percentage;
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        for (int i = 1; i <= t; i++) {
            sb.append("Recipe # " + i).append("\n");
            int r = sc.getInt(), p = sc.getInt(), d = sc.getInt();
            Ingredient[] ingredients = new Ingredient[r];
            double scalingFactor = ((double) d) / p;
            double scalingWeight = 0;
            for (int j = 0; j < r; j++) {
                ingredients[j] = new Ingredient(sc.getWord(), sc.getDouble(), sc.getDouble());
                if (ingredients[j].percentage == 100.0) scalingWeight = scalingFactor * ingredients[j].weight;
            }

            for (int j = 0; j < r; j++) {
                Ingredient in = ingredients[j];
                sb.append(in.name).append(" ").append((Math.round(in.percentage * scalingWeight / 10) / 10.0)).append("\n");
            }

            sb.append("----------------------------------------").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
