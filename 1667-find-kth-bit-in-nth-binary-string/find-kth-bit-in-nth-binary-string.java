class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("011");
        while(sb.length() <k){
            sb.append("1" + rev(inv(sb.toString())));
        }
        return sb.charAt(k-1);
    }
    public String rev(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String inv(String s){
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return sb.toString();
    }
}