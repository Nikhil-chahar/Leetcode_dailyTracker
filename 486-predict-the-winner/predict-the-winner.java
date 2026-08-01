class Solution {
    // boolean ans = false;
    public boolean predictTheWinner(int[] nums) {
        return find(nums,0,nums.length-1) >=0;
        // return ans;
    }

    public int find(int nums[],int le,int ri){
        if(le > ri){
            return 0;
        }
        if(le == ri){
            return nums[le];
        }

        int take = nums[le] - find(nums,le+1,ri);
        int notake = nums[ri] - find(nums,le,ri-1);

        return Math.max(take,notake);
    }
}