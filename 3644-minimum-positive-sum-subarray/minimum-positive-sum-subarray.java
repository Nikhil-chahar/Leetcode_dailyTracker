class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int mn = Integer.MAX_VALUE;
        int n = nums.size();
        for(int k=l;k<=r;k++){

            int sum = 0;
            for(int i=0;i<k;i++){
                sum += nums.get(i);
            }
            for(int i=k;i<n;i++){
                if(sum > 0){
                    mn = Math.min(mn,sum);
                }
                sum -= nums.get(i-k);
                sum += nums.get(i);
            }
            if(sum > 0){
                mn = Math.min(mn,sum);
            }
        }

        return mn == Integer.MAX_VALUE ? -1 : mn;
    }
}