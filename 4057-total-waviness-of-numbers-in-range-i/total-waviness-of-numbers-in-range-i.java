class Solution {
    public int totalWaviness(int num1, int num2) {
        int c = 0;

        while(num1 <= num2){
            c+= check(num1);
            num1++;
        }
        return c;
    }
    public int check(int num){
        String s = Integer.toString(num);
        if(s.length() <3){
            return 0;
        }
        int c = 0;
        for(int i=1;i<s.length()-1;i++){
            char ch1 = s.charAt(i-1);
            char ch2 = s.charAt(i);
            char ch3 = s.charAt(i+1);

            if((ch2 > ch1 && ch2 > ch3) || (ch2 < ch1 && ch2 < ch3)){
                c++;
            }
        }
        return c;
    }
}