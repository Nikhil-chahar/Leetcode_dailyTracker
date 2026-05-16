class Solution {
    public int findMin(int[] nums) {
        int st=0;
        int last =nums.length-1;
        if(nums[st]<nums[last]){
            return nums[st];
        }
        while(st<last){
            int mid = st + (last-st)/2;
            if(nums[mid]>nums[last]){
                st = mid+1; 
            }else if(nums[mid] < nums[last]){
                last = mid;
            }else{
                last--;
            }
        }
        return nums[last];
    }
}