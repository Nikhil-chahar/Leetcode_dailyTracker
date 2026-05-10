class Solution {
    public int minMoves(int[] nums) {
        int mx = 0;
        for(int val : nums){
            mx = Math.max(mx,val);
        }

        int sum =0;

        for(int v : nums){
            sum += (mx-v);
        }
        return sum;
    }
}