class Solution {
    // brute force
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int mod = 12345;
        long pref = 1;
        int ans[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = (int)pref;
                pref = (pref*grid[i][j])%mod;
            }
        }
        pref = 1;

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                ans[i][j] = (int)((ans[i][j] * pref)%mod);
                pref = (pref * grid[i][j])%mod;
            }
        }
        return ans;
    }
}