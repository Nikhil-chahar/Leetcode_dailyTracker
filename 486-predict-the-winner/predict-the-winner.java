class Solution {
    // boolean ans = false;
    public boolean predictTheWinner(int[] nums) {
        int dp[][] = new int[23][23];
        for(int a[] : dp){
            Arrays.fill(a,-1);
        }
        return find(nums,0,nums.length-1,dp) >=0;
        // return ans;
    }

    public int find(int nums[],int le,int ri,int dp[][]){
        if(le > ri){
            return 0;
        }
        if(le == ri){
            return nums[le];
        }

        if(dp[le][ri] != -1){
            return dp[le][ri];
        }

        int take = nums[le] - find(nums,le+1,ri,dp);
        int notake = nums[ri] - find(nums,le,ri-1,dp);

        return dp[le][ri] = Math.max(take,notake);
    }
}