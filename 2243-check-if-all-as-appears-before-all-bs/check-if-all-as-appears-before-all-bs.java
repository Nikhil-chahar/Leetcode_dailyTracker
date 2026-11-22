class Solution {
    public boolean checkString(String s) {
        boolean fl = true;
       for(char ch : s.toCharArray()){
        if(ch == 'b'){
            fl = false;
        }
        else if(ch == 'a' && !fl){
            return false;
        }
       } 
       return true;
    }
}