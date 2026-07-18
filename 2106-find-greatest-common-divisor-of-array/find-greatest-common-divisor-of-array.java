class Solution {
    public int findGCD(int[] nums) {
        int mn = 1001,mx = 0;

        for(int val : nums){
            if(mn > val){
                mn = val;
            }
            if(mx < val){
                mx = val;
            }
        }
        return gcd(mn,mx);
    }
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}