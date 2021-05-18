import java.io.PrintWriter;

class ImageProcessing {

    private int[][] image;
    private int[][] kernel;

    public void run()
    {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int h = sc.getInt(), w = sc.getInt(), n = sc.getInt(), m = sc.getInt();

        image = new int[h][w];
        kernel = new int[n][m];

        for (int i = 0; i < h; i++)
        {
            for (int j = 0; j < w; j++)
            {
                image[i][j] = sc.getInt();
            }
        }

        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = m - 1; j >= 0; j--)
            {
                kernel[i][j] = sc.getInt();
            }
        }

        for (int i = 0; i < h - n + 1; i++)
        {
            for (int j = 0; j < w - m + 1; j++)
            {
                out.printf("%d", calc(i, j));
                if (j < w - m)
                {
                    out.print(" ");
                }
            }
            out.println();
        }

        out.close();
        sc.close();
    }

    private int calc(int i, int j)
    {
        int x = 0;
        for (int k = 0; k < kernel.length; k++)
        {
            for (int l = 0; l < kernel[k].length; l++)
            {
                x += image[i + k][j + l] * kernel[k][l];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        new ImageProcessing().run();
    }
}
