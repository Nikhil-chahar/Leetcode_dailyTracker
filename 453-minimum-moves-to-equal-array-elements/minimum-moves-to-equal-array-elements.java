class Solution {
    public int minMoves(int[] nums) {
        int mn = nums[0];
        // int mx = nums[0];
        for(int v : nums){
            if(mn > v)
                mn = v;
        //     }else if(mx < v){
        //         mx = v;
        //     }
        }

        // if(mn == mx ){
        //     return 0;
        // }

        // return mx-mn+1;

        // Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;


        for(int i=n-1;i>=0;i--){
            ans += nums[i]-mn;
        }
        return ans;

    }
}