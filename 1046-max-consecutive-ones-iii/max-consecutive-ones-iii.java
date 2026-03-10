class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int mx = 0,st=0,en=0;

        while(en < nums.length){
            if(nums[en] == 0){
                k--;
            } 
            en++;
            while(k <0){
                if(nums[st] ==0){
                    k++;
                }
                st++;
            }
            mx =Math.max(mx,en-st);

        }
        return mx;
    }
}