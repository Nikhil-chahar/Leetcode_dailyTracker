class Solution {
    public int minElement(int[] nums) {
        int mx = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            // String s = String.valueOf(nums[i])
            int num = nums[i];
            int v = 0;
            while(num >0){
                v+= (num%10);
                num /= 10;
            }
            if(mx > v){
                mx = v;
            } 
        }
        return mx;
    }
}