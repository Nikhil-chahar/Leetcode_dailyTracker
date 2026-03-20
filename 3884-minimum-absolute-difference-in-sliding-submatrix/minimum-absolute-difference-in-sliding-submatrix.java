class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i <= n - k; i++) {
            List<Integer> ans = new ArrayList<>();

            for(int j = 0; j <= m - k; j++) {

                Set<Integer> set = new HashSet<>();

                // collect elements
                for(int x = i; x < i + k; x++) {
                    for(int y = j; y < j + k; y++) {
                        set.add(grid[x][y]);
                    }
                }

                // convert to list
                List<Integer> ll = new ArrayList<>(set);
                Collections.sort(ll);

                int mn = Integer.MAX_VALUE;

                for(int t = 1; t < ll.size(); t++) {
                    mn = Math.min(mn, ll.get(t) - ll.get(t - 1));
                }

                ans.add(ll.size() == 1 ? 0 : mn);
            }

            res.add(ans);
        }

        // convert List -> array
        int rows = res.size();
        int cols = res.get(0).size();

        int[][] fin = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                fin[i][j] = res.get(i).get(j);
            }
        }

        return fin;
    }
}