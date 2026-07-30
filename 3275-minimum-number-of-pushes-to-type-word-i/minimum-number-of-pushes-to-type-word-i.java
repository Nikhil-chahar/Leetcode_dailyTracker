class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0,i=1;

        while(n > 0){
            ans += i*Math.min(n,8);
            n-=8;
            i++;
        }

        return ans;
    }
}
