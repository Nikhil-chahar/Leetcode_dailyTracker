class Solution {
    public int maxFrequency(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int n = nums.length;
        long pre[] = new long[n];
        pre[0] = nums[0];

        for(int i = 1;i<n;i++){
            pre[i] = nums[i]+pre[i-1];
        }

        for(int i=0;i<n;i++){
            int op = bin(nums,k,pre,i);
            ans = Math.max(op,ans);
        }

        return ans;

    }
    public int bin(int nums[],int k,long pre[],int i){

        int tar = nums[i];

        int l=0;
        int r = i;
        int best = i;

        while(l <= r){
            int mid = l +(r-l)/2;
            long count = (i-mid+1);
            long win = count*tar;

            long curr = pre[i]-pre[mid]+nums[mid];

            long ops = win-curr;

            if(ops > k){
                l = mid+1;
            }else{
                best = mid;
                r= mid-1;
            }
        }
        return i-best+1;
    }
}