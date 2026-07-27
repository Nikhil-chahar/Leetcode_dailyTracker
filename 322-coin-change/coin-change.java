class Solution {
    int IN = 1000000000;
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int dp[][] = new int[n][amount+1];

        for(int a[] : dp){
            Arrays.fill(a,-1);
        }

        int ans = find(coins,amount,dp,0);
        return ans==IN ? -1 : ans;
    }

    public int find(int coins[],int amt,int dp[][],int ind){
        if(amt == 0){
            return 0;
        }
        if(amt < 0 || ind== coins.length){
            return IN;
        }
        if(dp[ind][amt] != -1){
            return dp[ind][amt];
        }

        int inc = 1+ find(coins,amt-coins[ind],dp,ind);
        int exc = find(coins,amt,dp,ind+1);

        return dp[ind][amt] = Math.min(inc,exc); 
    }
}