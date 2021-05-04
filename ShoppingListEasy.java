import java.util.Map;
import java.util.TreeMap;

class ShoppingListEasy
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        StringBuilder sb = new StringBuilder();

        int n = sc.getInt(), m = sc.getInt(), max = 0, total = 0;

        Map<String, Integer> tmap = new TreeMap<>();

        String name;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                name = sc.getWord();

                if (tmap.containsKey(name))
                {
                    int newVal = tmap.get(name) + 1;
                    max = Math.max(max, newVal);
                    tmap.put(name, newVal);
                }
                else
                {
                    tmap.put(name, 1);
                }
            }
        }

        sb.append("\n");

        for (Map.Entry<String, Integer> e : tmap.entrySet())
        {
            if (e.getValue() == max && max == n)
            {
                total++;
                sb.append(e.getKey());
                sb.append("\n");
            }
        }

        sb.insert(0, total);

        System.out.print(sb.toString());

        sc.close();
    }
}