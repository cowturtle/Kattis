import java.util.Arrays;
import java.util.HashMap;
import java.util.Collection;

class BirthdayMemorization
{   
    public static void main(String[] args)
    {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();

        HashMap<String, String> dobname = new HashMap<>();
        HashMap<String, Integer> namelike = new HashMap<>();

        String name, dob;
        int like;

        while (n-- > 0)
        {
            name = sc.getWord();
            like = sc.getInt();
            dob = sc.getWord();

            if (dobname.containsKey(dob))
            {
                if (namelike.get(dobname.get(dob)) < like)
                {
                    dobname.put(dob, name);
                    namelike.put(name, like);
                }
            }
            else
            {
                dobname.put(dob, name);
                namelike.put(name, like);
            }
        }

        Collection<String> names = dobname.values();
        String[] sarr = names.toArray(new String[names.size()]);
        Arrays.sort(sarr);

        System.out.println(sarr.length);
        for (String s : sarr)
        {
            System.out.println(s);
        }

        sc.close();
    }
}

