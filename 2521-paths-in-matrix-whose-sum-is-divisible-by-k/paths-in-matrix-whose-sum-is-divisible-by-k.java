class Solution {
    int n;
    int m;
    int dp[][][];
    int mod = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        n = grid.length;
        m = grid[0].length;
        dp = new int[n][m][k];

        for(int a[][] : dp){
            for(int ar[] : a){
                Arrays.fill(ar,-1);
            }
        }

        return find(grid,k,0,0,0);
    }
    public int find(int grid[][],int k,int i,int j,int rem){

        rem = (rem+grid[i][j])%k; // to calculate the rem at paritcular index

        if(i == n-1 && j == m-1){
            return rem==0?1:0;
        }

        if(dp[i][j][rem] != -1){
            return dp[i][j][rem];
        }

        // sum += grid[i][j];

        long ans = 0;

        if(i+1 < n){
            ans += find(grid,k,i+1,j,rem);
        }
        if(j+1 < m){
           ans += find(grid,k,i,j+1,rem);
        }

        return dp[i][j][rem] = (int)(ans%mod);

    }
}