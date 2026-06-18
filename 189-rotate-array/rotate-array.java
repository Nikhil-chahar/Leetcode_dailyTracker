class Solution {
    public void rotate(int[] nums, int k) {
        
        int n= nums.length;
        int prev = nums[n-1];
        k = k%n;
        if(k == 0){
            return;
        }

        int le = 0;
        int ri = n-1;
        while(le < ri){
            int tem = nums[le];
            nums[le] = nums[ri];
            nums[ri] = tem;
            le++;
            ri--;
        }

        le = 0;
        ri = k-1;

        while(le < ri){
            int tem = nums[le];
            nums[le] = nums[ri];
            nums[ri] = tem;
            le++;
            ri--;
        }
        le = k;
        ri = n-1;

        while(le < ri){
            int tem = nums[le];
            nums[le] = nums[ri];
            nums[ri] = tem;
            le++;
            ri--;
        }
    }
}