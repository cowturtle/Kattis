class Logo
{
    public final double _DEGREE = Math.PI / 180;

    private double x;
    private double y;
    private int angle;

    public Logo()
    {
        initialise();
    }

    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int t = sc.getInt(), n, value;
        String action;

        while (t-- > 0)
        {           
            initialise(); 
            n = sc.getInt();
            while (n-- > 0)
            {
                action = sc.getWord();
                value = sc.getInt();
                move(action, value);
            }            
            sc.println(distanceFromOrigin());
        }
        
        sc.close();
    }

    private void initialise()
    {
        this.x = 0;
        this.y = 0;
        this.angle = 0;
    }

    private Integer distanceFromOrigin()
    {
        return (int) Math.round(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)));
    }

    private void move(String action, int value)
    {
        switch (action) 
        {
            case "fd":
                this.x += value * Math.sin(angle * _DEGREE);
                this.y += value * Math.cos(angle * _DEGREE);
                return;
            case "bk":  
                this.x -= value * Math.sin(angle * _DEGREE);
                this.y -= value * Math.cos(angle * _DEGREE);
                return;
            case "lt":
                this.angle += value;                
                return;
            case "rt":
                this.angle -= value;
                return;
            default: return;
        }
    }

    public static void main(String[] args)
    {
        new Logo().run();
    }
}