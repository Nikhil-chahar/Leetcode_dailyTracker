class Solution {
    public String digitSum(String s, int k) {
        
        while(s.length() > k){
            String ot = "";
            int n = s.length();

            for(int i=0;i<n;i+=k){
                int v = 0;
                for(int j=i;j<i+k && j <n ;j++){
                    v += (s.charAt(j)-'0');
                }
                ot += v;
            }
            s = ot;
        }
        return s;
    }
}