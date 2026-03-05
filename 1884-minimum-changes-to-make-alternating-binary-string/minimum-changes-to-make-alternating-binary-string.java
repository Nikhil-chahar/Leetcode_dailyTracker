class Solution {
    public int minOperations(String s) {
        int st0 = 0;
        int st1 = 0;

        for(int i=0;i<s.length();i++){
            char ex0 = (i%2 == 0) ? '0' : '1';
            char ex1 = (i%2 == 0) ? '1' : '0';

            if(ex0 != s.charAt(i)) st0++;
            if(ex1 != s.charAt(i)) st1++;
        }
        return Math.min(st0,st1);
    }
}