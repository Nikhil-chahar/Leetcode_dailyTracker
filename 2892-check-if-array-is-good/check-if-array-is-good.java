class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        for(;i<nums.length;i++){
            System.out.println(nums[i-1]);
            if(nums[i-1] !=i){
                return false;
            }
        }
        // System.out.println(nums[i-1] + " "+ i);
        if(nums[i-1] != i-1) return false;
        return true;

    }
}