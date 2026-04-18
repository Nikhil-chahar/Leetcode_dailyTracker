class Solution {
    public int mirrorDistance(int n) {
        int val = n;

        int mi=0;
        while(val >0){
            int temp = val%10;
            mi = mi *10 +temp;
            val/=10;
        }

        return (int)(Math.abs(n-mi));
    }
}