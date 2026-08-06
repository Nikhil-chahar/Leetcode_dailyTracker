class Solution {
    public int smallestNumber(int n, int t) {
        
        // int num = n;

        while(true){
            int num = n;

            int pr = 1;

            while(num >0){
                int tem = num%10;
                pr*=tem;
                num/=10;
            }

            if(pr%t==0){
                break;
            }
            n++;
        }
        return n;

    }
}