class Solution {

    int[][] dirs = {
        {0, -1}, // left
        {0, 1},  // right
        {-1, 0}, // up
        {1, 0}   // down
    };

    // allowed directions for each type
    int[][][] typeDirs = {
        {},
        {{0, -1}, {0, 1}},     // 1
        {{-1, 0}, {1, 0}},     // 2
        {{0, -1}, {1, 0}},     // 3
        {{0, 1}, {1, 0}},      // 4
        {{0, -1}, {-1, 0}},    // 5
        {{0, 1}, {-1, 0}}      // 6
    };

    public boolean hasValidPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        return dfs(0, 0, grid, vis);
    }

    boolean dfs(int i, int j, int[][] grid, boolean[][] vis) {
        int n = grid.length, m = grid[0].length;

        if (i == n - 1 && j == m - 1) return true;

        vis[i][j] = true;

        for (int[] d : typeDirs[grid[i][j]]) {
            int ni = i + d[0];
            int nj = j + d[1];

            if (ni < 0 || nj < 0 || ni >= n || nj >= m || vis[ni][nj]) continue;

            // check reverse connection
            for (int[] back : typeDirs[grid[ni][nj]]) {
                if (ni + back[0] == i && nj + back[1] == j) {
                    if (dfs(ni, nj, grid, vis)) return true;
                }
            }
        }
        return false;
    }
}