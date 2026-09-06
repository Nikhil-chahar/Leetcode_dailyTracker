class Solution {
    int dp[][];
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = s.length();

        dp = new int[n][m];
        for(int a[] : dp){
            Arrays.fill(a,-1);
        }
        return find(s,t,0,0,dp);
    }
    public int find(String s,String t,int i,int j,int dp[][]){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = find(s,t,i+1,j,dp);

        if(s.charAt(i) == t.charAt(j)){
            ans +=find(s,t,i+1,j+1,dp);
        }

        return dp[i][j] = ans;
    }
}