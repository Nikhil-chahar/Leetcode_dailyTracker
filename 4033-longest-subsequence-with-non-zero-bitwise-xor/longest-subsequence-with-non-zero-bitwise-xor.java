class Solution {
    public int longestSubsequence(int[] nums) {
        int n =  nums.length;
        int xor = 0;
        int fl = 0;
        for(int val : nums){
            if(val != 0){
                fl =1;
            }
            xor^=val;
        }

        if(fl==0){
            return 0;
        }

        if(xor != 0){
            return n;
        }

        return n-1;
    }
}