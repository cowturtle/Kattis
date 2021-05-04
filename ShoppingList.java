import java.util.Set;
import java.util.TreeSet;

class ShoppingList 
{
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        StringBuilder sb = new StringBuilder();

        int n = sc.getInt(), m = sc.getInt();

        Set<String> tset = new TreeSet<>();
        Set<String> mset = new TreeSet<>();

        String name;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                name = sc.getWord();

                if (i == 0)
                {
                    tset.add(name);
                }
                else
                {
                    mset.add(name);
                }                
            }

            if (i > 0)
            {
                tset.retainAll(mset);
                mset.clear();
            }            
        }

        sb.append(tset.size());
        sb.append("\n");

        for (String s : tset)
        {
            sb.append(s);
            sb.append("\n");
        }    

        System.out.print(sb.toString());

        sc.close();
    }
}
