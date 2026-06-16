class Solution {
    public int minMovesToMakePalindrome(String st) {
        char s[] = st.toCharArray();
        int le = 0;
        int ri = s.length-1;
        int op=0;

        while(le < ri){
            int r = ri;

            while(r > le && s[r] != s[le]){
                r--;
            }

            if(r == le){
                char ch = s[le];
                s[le] = s[le+1];
                s[le+1] = ch;
                op++;
            }else{

                while(r < ri){
                    char ch = s[r];
                    s[r] = s[r+1];
                    s[r+1] = ch;
                    op++;
                    r++;
                }
                le++;
                ri--;
            }
        }
        return op;
    }
}