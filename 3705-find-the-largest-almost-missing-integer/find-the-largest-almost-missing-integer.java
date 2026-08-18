class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int freq[] = new int[51];

        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                freq[nums[j]]++;
                System.out.print(nums[j]+" ");
            }
            System.out.println();
        }
        int mx = -1;

        for(int i =0;i<n;i++){
            if(freq[nums[i]] == 1 || k==n){
                mx = Math.max(nums[i],mx);
            }
        }

        return mx;
    }
}