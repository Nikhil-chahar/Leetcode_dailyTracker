class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n*(2 + (n-1)*2)/2;
        int b = n*(4 + (n-1)*2)/2;

        return gcd(a,b);
        // return b;

    }
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}