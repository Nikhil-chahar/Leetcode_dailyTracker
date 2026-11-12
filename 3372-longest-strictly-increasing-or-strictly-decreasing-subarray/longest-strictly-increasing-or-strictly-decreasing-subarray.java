class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int n = nums.length;

    //    int inc[] = new int[n];
    //    int des[] = new int[n];

    //     Arrays.fill(inc,1);
    //     Arrays.fill(des,1);
        
    //     for(int i=1;i<n;i++){
    //         if(nums[i] > nums[i-1]){
    //             inc[i] = inc[i-1]+1;
    //         }
    //     } 
    //     for(int i=n-2;i>=0;i--){
    //         if(nums[i] > nums[i+1]){
    //             des[i] = des[i+1]+1;
    //         }
    //     } 

        int mx = 1;
        int cnt = 1;

        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1])
                cnt++;
            else
                cnt = 1;
            
            if(cnt > mx)
                mx = cnt;
        }
        cnt = 1;

        for(int i=n-2;i>=0;i--){
            if(nums[i] > nums[i+1])
                cnt++;
            else
                cnt = 1;
            
            if(cnt > mx)
                mx = cnt;
        }


    //    for(int i =0 ;i<n;i++){
    //     mx = Math.max(mx,Math.max(inc[i],des[i]));
    //    }

       return mx;
    }
}