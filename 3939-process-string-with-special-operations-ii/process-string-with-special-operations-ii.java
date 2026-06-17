class Solution {
    public char processStr(String s, long k) {
        long len = 0;

        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(len!=0){
                    len--;
                }
            }else if(ch == '#'){
                len *=2;
            }else if(ch == '%'){
                // nothing
            }else{
                len++;
            }
        }

        if(k >= len){
            return '.';
        }
         for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case '*':
                    len++;
                    break;
                case '#':
                    if (k + 1 > (len + 1) / 2) {
                        k -= len / 2;
                    }
                    len = (len + 1) / 2;
                    break;
                case '%':
                    k = len - k - 1;
                    break;
                default:
                    if (k + 1 == len) {
                        return c;
                    }
                    len--;
                    break;
            }
        }
        return '.';

    }
}