class Solution {
    public int numberOfSpecialChars(String word) {
        int freq[] = new int[26];
        int freq2[] = new int[26];

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >='a' && ch <= 'z'){
                freq[ch-'a']++;
            }else{
                freq2[ch-'A']++;
            }
        }
        int c = 0;

        for(int i=0;i<26;i++){
            if(freq[i] > 0 && freq2[i] >0){
                c += 1;
            }
        }
        return c;
    }
}