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

class IWannaBeTheVeryBest {
    
    public static void main(String[] args) {

        class Pokenom {
            int id;
            Long attack;
            Long defense;
            Long health;

            Pokenom(int id, Long attack, Long defense, Long health) {
                this.id = id;
                this.attack = attack;
                this.defense = defense;
                this.health = health;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                } else if (obj instanceof Pokenom) {
                    return this.id == (((Pokenom) obj).id);
                }
                return false;
            }
        }

        Kattio sc = new Kattio(System.in);
        Comparator<Pokenom> attackComp = new Comparator<>() {
            @Override
            public int compare(Pokenom p1, Pokenom p2) {
                return p2.attack.compareTo(p1.attack);
            }
        };
        Comparator<Pokenom> defenseComp = new Comparator<>() {
            @Override
            public int compare(Pokenom p1, Pokenom p2) {
                return p2.defense.compareTo(p1.defense);
            }
        };
        Comparator<Pokenom> healthComp = new Comparator<>() {
            @Override
            public int compare(Pokenom p1, Pokenom p2) {
                return p2.health.compareTo(p1.health);
            }
        };
        int n = sc.getInt(), k = sc.getInt();
        ArrayList<Pokenom> pokenoms = new ArrayList<>();
        Set<Pokenom> chosen = new HashSet<>();
        for (int i = 0; i < n; i++)
            pokenoms.add(new Pokenom(i, sc.getLong(), sc.getLong(), sc.getLong()));
        Collections.sort(pokenoms, attackComp);
        for (int i = 0; i < k; i++)
            chosen.add(pokenoms.get(i));
        Collections.sort(pokenoms, defenseComp);
        for (int i = 0; i < k; i++)
            chosen.add(pokenoms.get(i));
        Collections.sort(pokenoms, healthComp);
        for (int i = 0; i < k; i++)
            chosen.add(pokenoms.get(i));
        System.out.println(chosen.size());
        sc.close();
    }
    
}
