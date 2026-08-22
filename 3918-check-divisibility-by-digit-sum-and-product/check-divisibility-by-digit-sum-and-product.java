class Solution {
    public boolean checkDivisibility(int n) {
        int cp = n;
        int sum = 0;
        int p =1;

        while(n>0){
            int t = n%10;
            p*=t;
            sum +=t;
            n/=10;
        }
        
        return cp%(p+sum)==0;
    }
}