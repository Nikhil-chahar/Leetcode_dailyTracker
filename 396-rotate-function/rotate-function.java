class Solution {
    public int maxRotateFunction(int[] nums) {
        int mx = 0;
        int sum = 0; 
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
            mx += (i*nums[i]);
        }
        int ans = mx;
        
        for(int i=n-1;i>=0;i--){
            mx = mx+sum -n*nums[i];
            ans = Math.max(mx,ans);
        }
        return ans;
    }
}