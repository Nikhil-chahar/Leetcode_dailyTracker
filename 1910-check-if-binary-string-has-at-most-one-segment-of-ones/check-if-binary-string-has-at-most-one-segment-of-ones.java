class Solution {
    public boolean checkOnesSegment(String s) {
        boolean fl = false;
        for(char ch : s.toCharArray()){
            if(fl && ch == '1'){
                return false;
            }else if(ch == '0'){
                fl = true;
            }
        }
        return true;
    }
}