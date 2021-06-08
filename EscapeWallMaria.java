import java.util.LinkedList;
import java.util.Queue;

class EscapeWallMaria
{
    private int[][] moves = new int[][]{
        {0, 1, 0}, // RIGHT
        {1, 0, 1}, // DOWN
        {0, -1, 2}, // LEFT
        {-1, 0, 3} // UP
    };    
    private int zones;
    private char[][] grid;
    private int[][] counter;

    public void run()
    {
        Kattio sc = new Kattio(System.in);

        int t = sc.getInt(), n = sc.getInt(), m = sc.getInt();
        boolean inescapable = true;
        int startx = -1, starty = -1;
        String s;

        this.zones = Integer.MAX_VALUE;
        this.grid = new char[n][m];
        this.counter = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            s = sc.getWord();
            for (int j = 0; j < m; j++)
            {
                this.counter[i][j] = 4000;
                this.grid[i][j] = s.charAt(j);
                if (this.grid[i][j] == 'S')
                {
                    startx = i;
                    starty = j;
                }

                if (onBorder(i, j) && this.grid[i][j] != '1')
                {
                    inescapable = false;
                }
            }
        }

        if (inescapable)
        {
            sc.println("NOT POSSIBLE");
        }
        else
        {
            this.counter[startx][starty] = 0;
            walk(startx, starty, t);

            if (this.zones <= t)
            {
                sc.println(this.zones);
            }
            else
            {
                sc.println("NOT POSSIBLE");
            }
        }
        
        // for (int i = 0; i < this.counter.length; i++)
        // {
        //     for (int j = 0; j < this.counter[i].length; j++)
        //     {
        //         sc.printf("%d ", this.counter[i][j]);
        //     }
        //     sc.println();
        // }

        sc.close();
    }

    private void walk(int startx, int starty, int time)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{ startx, starty });        

        int[] arr;        
        int count;
        int x, y, xx, yy;

        while (!queue.isEmpty())
        {
            arr = queue.poll();
            x = arr[0];
            y = arr[1];
            if (onBorder(x, y)) 
            {            
                this.zones = Math.min(this.zones, this.counter[x][y]);
            }
            else if (this.counter[x][y] < time)
            {
                for (int[] move: this.moves)
                {
                    xx = x + move[0];
                    yy = y + move[1];
                    count = this.counter[x][y] + 1;
                    if (inRange(xx, yy))
                    {
                        if (count < this.counter[xx][yy])
                        {
                            char cell = this.grid[xx][yy];
                            if (walkable(cell, move[2]))
                            {
                                this.counter[xx][yy] = count;
                                queue.add(new int[]{ xx, yy });
                            }
                        }                    
                    }                
                }
            }        
        }
    }

    private boolean inRange(int x, int y)
    {
        return 0 <= x && x < this.grid.length && 0 <= y && y < this.grid[x].length;
    }

    private boolean onBorder(int x, int y)
    {
        return x == 0 || y == 0 || x == this.grid.length - 1 || y == this.grid[0].length - 1;
    }

    private boolean walkable(char cell, int moveType)
    {
        return cell == '0'
            || (moveType == 0 && cell == 'L')
            || (moveType == 1 && cell == 'U')
            || (moveType == 2 && cell == 'R')
            || (moveType == 3 && cell == 'D');
    }

    public static void main(String[] args)
    {
        new EscapeWallMaria().run();
    }
}