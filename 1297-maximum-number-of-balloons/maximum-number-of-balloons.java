class Solution {
    public int maxNumberOfBalloons(String text) {
        int mx = text.length();

        int  freq[] = new int[26];

        for(char ch : text.toCharArray()){
            freq[ch-'a']++;
        }

        String s = "balloon";

        for(char ch : s.toCharArray()){
            if(ch == 'l' || ch == 'o'){
                mx = Math.min(mx,freq[ch-'a']/2);
            }
            else {
                mx = Math.min(mx,freq[ch-'a']);
            }
        }

        return mx;


    }
}