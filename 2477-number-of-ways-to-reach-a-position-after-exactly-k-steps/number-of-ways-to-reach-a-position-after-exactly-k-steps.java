class Solution {
    // int ans= 0;
    int dp[][];
    int mod = 1_000_000_007;
    int start;
    int sp;
    public int numberOfWays(int st, int en, int k) {
        dp = new int[2*k+1][k+1];
        start=st;
        sp = k;

        for(int a[] : dp){
            Arrays.fill(a,-1);
        }

        return rec(st,en,k);
    }
    public int rec(int st,int en,int k){
        if(k==0){
            if(st == en){
                return 1;
            }else{
                return 0;
            }
        }
        int ind = st-start+sp;

        if(dp[ind][k] != -1){
            return dp[ind][k];
        }
        long ans = 0;
        ans += rec(st+1,en,k-1);
        ans += rec(st-1,en,k-1);

        return dp[ind][k] = (int)(ans%mod);
    }
}