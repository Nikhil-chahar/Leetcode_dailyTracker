class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;

        for(int i=1;i<=n;i++){
            if(isGood(i)){
               cnt++;
            }
        }
        return cnt;
    }
    public boolean isGood(int n){
        boolean dif = false;
        while(n > 0){
            int t= n%10;
            if(t == 3 || t==4 || t==7){
                return false;
            }
            if(t == 2 || t==5 || t==6 || t == 9){
                dif = true;
            }
            n/=10;
        }
        return dif;
    }
}