class Solution {
    public int largestAltitude(int[] gain) {
        int mx = 0;
        int sum = 0;

        for(int v : gain){
            sum += v;
            if(sum > mx){
                mx = sum;
            }
        }
        return mx;
    }
}