class Solution {
    public int minMoves(int[] nums) {
        int mx = 0;

        for(int v : nums){
            if(mx < v){
                mx = v;
            }
        }
        int ans = 0;
        for(int v : nums){
            ans += mx-v;
        }
        return ans;
    }
}