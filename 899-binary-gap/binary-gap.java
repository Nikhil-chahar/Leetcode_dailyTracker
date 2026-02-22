class Solution {
    public int binaryGap(int num) {
        String s = Integer.toBinaryString(num);
        int n = s.length();
        int prev =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '1'){
                prev = i;
                break;
            }
        }
        int mx=0;
        for(int i=prev+1;i<n;i++){
            if(s.charAt(i) =='1'){
                mx = Math.max(mx,i-prev);
                prev =i;
            }
        }
        return mx;
    }
}