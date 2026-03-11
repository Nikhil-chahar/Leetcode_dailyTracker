class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0,en=0,mn=nums.length+1;
        long sum = 0;

        while(en < nums.length){
            sum += nums[en];
            
            while(sum >= target){
                mn = Math.min(mn,en-si+1);
                sum -= nums[si];
                si++;
            }
            en++;
        }
        return mn == nums.length+1 ? 0 : mn;
    }
}