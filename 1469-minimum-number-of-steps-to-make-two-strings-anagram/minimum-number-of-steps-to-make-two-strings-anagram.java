class Solution {
    public int minSteps(String s, String t) {
        int freq[] = new int[26];
        int c = 0;

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            freq[ch-'a']--;
        }

        for(int  i=0;i<26;i++){
            if(freq[i] >0){
                c += freq[i];
            }
        }
        return c;
    }
}