class FunHouse
{
    private char[][] grid;
    char direction;
    int x, y;

    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int w, l, house = 0;

        this.x = -1;
        this.y = -1;

        while (true)
        {
            w = sc.getInt();
            l = sc.getInt();
            house++;
            if (w == 0 && l == 0) 
            {
                break;
            }
            else
            {
                readInput(sc, l, w);
            }

            find(true);
            
            print(sc, house, l, w);
        }

        sc.close();
    }

    private void print(Kattio sc, int house, int l, int w)
    {
        sc.printf("HOUSE %d\n", house);
        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < w; j++)
            {
                sc.print(grid[i][j]);
            }
            sc.printf("\n");
        }
    }

    private void readInput(Kattio sc, int l, int w)
    {
        String s;
        this.grid = new char[l][w];
        for (int i = 0; i < l; i++)
        {
            s = sc.getWord();
            for (int j = 0; j < w; j++)
            {
                this.grid[i][j] = s.charAt(j);
                if (isStart(i, j))
                {
                    x = i;
                    y = j;
                }
            }
        }
    }

    private boolean isStart(int x, int y)
    {
        return this.grid[x][y] == '*';
    }

    private void find(boolean start)
    {
        // System.out.printf("%d %d\n", this.x, this.y);
        if (start)
        {        
            if (this.x == 0)
            {
                this.direction = 'D';
                this.x++;       
            }
            else if (this.x == grid.length - 1)
            {
                this.direction = 'U';
                this.x--;
            }
            else if (this.y == 0)
            {
                this.direction = 'R';
                this.y++;
            }
            else if (this.y == grid[this.x].length - 1)
            {
                this.direction = 'L';
                this.y--;
            }
        }
        else
        {
            if (this.x == 0 || this.x == grid.length - 1 || this.y == 0 || this.y == grid[this.x].length - 1)
            {
                this.grid[this.x][this.y] = '&';
                return;
            }
            else if (this.grid[this.x][this.y] == '/')
            {
                if (this.direction == 'U')
                {
                    this.direction = 'R';
                    this.y++;    
                }
                else if (this.direction == 'D')
                {
                    this.direction = 'L';
                    this.y--;
                }
                else if (this.direction == 'L')
                {
                    this.direction = 'D';
                    this.x++;
                }
                else if (this.direction == 'R')
                {
                    this.direction = 'U';
                    this.x--;
                }
            }
            else if (this.grid[this.x][this.y] == '\\')
            {
                if (this.direction == 'U')
                {
                    this.direction = 'L';
                    this.y--;    
                }
                else if (this.direction == 'D')
                {
                    this.direction = 'R';
                    this.y++;
                }
                else if (this.direction == 'L')
                {
                    this.direction = 'U';
                    this.x--;
                }
                else if (this.direction == 'R')
                {
                    this.direction = 'D';
                    this.x++;
                }
            }
            else
            {
                if (this.direction == 'U')
                {
                    this.x--;    
                }
                else if (this.direction == 'D')
                {
                    this.x++;
                }
                else if (this.direction == 'L')
                {
                    this.y--;
                }
                else if (this.direction == 'R')
                {
                    this.y++;
                }
            }
        }

        find(false);
    }

    public static void main(String[] args)
    {
        new FunHouse().run();
    }
}