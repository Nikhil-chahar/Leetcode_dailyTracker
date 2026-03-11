class Solution {
    public int bitwiseComplement(int n) {
        return Integer.parseInt(find(n),2);
    }
    public String find(int n){
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        System.out.print(sb);
        return sb.toString();
    }
}