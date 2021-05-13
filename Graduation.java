class Graduation {
    public void run() {
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt(), m = sc.getInt(), k = sc.getInt(), ans = 0;

        int[] parents = new int[k];
        for (int i = 0; i < k; i++) {
            parents[i] = -1;
        }

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            char[] arr = sc.getWord().toCharArray();
            for (int j = 0; j < m; j++) {
                grid[i][j] = arr[j] - 'A';
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    union(parents, grid[i][j], grid[i - 1][j]);
                }
            }
        }

        for (int parent : parents) {
            if (parent == -1) {
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }

    private void union(int[] parents, int i, int j) {
        i = find(parents, i);
        j = find(parents, j);

        if (i != j) {
            parents[j] = i;
        }
    }

    private int find(int[] parents, int x) {
        if (parents[x] == -1)
            return x;
        return parents[x] = find(parents, parents[x]);
    }

    public static void main(String[] args) {
        new Graduation().run();
    }
}