class Zyxab {
    public void run()
    {
        Kattio sc = new Kattio(System.in);

        String name, best = "";
        int n = sc.getInt();

        while (n-- > 0)
        {
            name = sc.getWord();

            if (name.length() >= 5 && !isDuplicate(name))
            {
                if (best.isEmpty() || name.length() < best.length())
                {
                    best = name;
                }
                else if (name.length() == best.length())
                {   
                    best = largerAlphabetically(name, best);
                }                
            }
        }

        System.out.println(best.isEmpty() ? "neibb!" : best);

        sc.close();
    }

    private boolean isDuplicate(String word)
    {
        boolean[] chars = new boolean[256];

        char c;
        for (int i = 0; i < word.length(); i++)
        {
            if (chars[(c = word.charAt(i))]) return true;
            chars[c] = true;
        }
        return false;
    }

    private String largerAlphabetically(String a, String b)
    {
        for (int i = 0; i < a.length() && i < b.length(); i++)
        {
            if (a.charAt(i) > b.charAt(i))
            {
                return a;
            }
            else if (b.charAt(i) > a.charAt(i))
            {
                return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new Zyxab().run();
    }
}