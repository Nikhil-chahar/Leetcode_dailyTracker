class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int pre[] = new int[n];
        int val = Integer.MAX_VALUE;

        for(int i=n-1;i>=0;i--){
            val = Math.min(nums[i],val);
            pre[i] = val;
        }
        int ans = -1;
        int mx = 0;

        for(int i=0;i<n;i++){
            mx = Math.max(mx,nums[i]);
            if(mx-pre[i] <= k){
                return i;
            }
        }

        return -1;
    }
}