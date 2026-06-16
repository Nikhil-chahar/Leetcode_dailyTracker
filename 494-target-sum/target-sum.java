class Solution {
    int cnt =0;
    public int findTargetSumWays(int[] nums, int target) {
        find(nums,target,0,0);
        return cnt;
    }
    public void find(int nums[],int target,int i,int val){
        if(target == val && i == nums.length){
            cnt++;
            return ;
        }
        
        if(i == nums.length){
            return ;
        }

        find(nums,target,i+1,val+nums[i]);
        find(nums,target,i+1,val-nums[i]);


    }
}