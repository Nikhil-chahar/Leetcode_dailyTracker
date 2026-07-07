class Solution {
    public long sumAndMultiply(int n) {
        long val = 0;
        long sum = 0;

        while(n > 0){
            int tem = n%10;
            n /=10;
            if(tem == 0) continue;
            val = val*10+tem;
            sum += tem;
        }
        long rev = 0;
        while(val > 0){
            long tem = val%10;
            rev = rev*10 + tem;
            val /= 10;
        }

        return rev*sum;

    }
}