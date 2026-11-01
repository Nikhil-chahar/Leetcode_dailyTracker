class Solution {
    public int minMoves(int[] nums) {
        // int mn = nums[0];
        // int mx = nums[0];
        // for(int v : nums){
        //     if(mn > v){
        //         mn = v;
        //     }else if(mx < v){
        //         mx = v;
        //     }
        // }

        // if(mn == mx ){
        //     return 0;
        // }

        // return mx-mn+1;

        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;


        for(int i=0;i<n-1;i++){
            int diff = nums[i+1]-nums[i];
            ans += diff;
            for(int j=i+2;j<n;j++){
                nums[j] += diff;
            }
        }
        return ans;
    }
}