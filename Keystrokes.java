import java.util.ArrayDeque;

class Keystrokes
{    
    private ArrayDeque<Character> back;
    private ArrayDeque<Character> front;

    public void run()
    {
        Kattio sc = new Kattio(System.in);
        
        String s = sc.getWord();
        int len = s.length();
        char c;

        this.back = new ArrayDeque<>();
        this.front = new ArrayDeque<>();

        for (int i = 0; i < len; i++)
        {
            c = s.charAt(i);

            if (isAction(c))
            {
                doAction(c);
            }
            else 
            {
                add(c);                
            }
        }

        print(sc);

        sc.close();
    }

    private void add(char c)
    {
        this.back.addLast(c);   
    }

    private void print(Kattio sc)
    {        
        for (Character c : this.back)
        {
            sc.print(c);
        }
        for (Character c : this.front)
        {
            sc.print(c);
        }
        sc.println();
    }

    private boolean isAction(char c)
    {
        return c == 'L' || c == 'R' || c == 'B';
    }

    private void doAction(char c)
    {
        if (c == 'L')
        {
            this.front.addFirst(this.back.pollLast());
        }
        else if (c == 'R')
        {
            this.back.addLast(this.front.pollFirst());
        }
        else if (c == 'B')
        {
            this.back.pollLast();
        }
    }    

    public static void main(String[] args)
    {
        new Keystrokes().run();
    }
}