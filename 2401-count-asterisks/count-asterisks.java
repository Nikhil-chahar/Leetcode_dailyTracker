class Solution {
    public int countAsterisks(String s) {
        int c = 0;
        int b = 0;

        for(char ch : s.toCharArray()){
            if(ch == '|'){
                b++;
            }
            b%=2;
            if(b <1 && ch == '*'){
                // System.out.println(ch);
                c++;
            }
            System.out.println(ch +" "+ c + " " + b);
        } 
        return c;
    }
}