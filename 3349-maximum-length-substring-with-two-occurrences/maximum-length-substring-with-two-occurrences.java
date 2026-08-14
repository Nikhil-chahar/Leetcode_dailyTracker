class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[] = new int[26];

        int le = 0,ri=0;
        int n = s.length();
        int ans = 0;

        while(ri < n){
            char ch= s.charAt(ri);
            freq[ch-'a']++;

            while(freq[ch-'a'] > 2){
                char ch2 = s.charAt(le);
                freq[ch2-'a']--;
                le++;
            }

            ans = Math.max(ans,ri-le+1);

            ri++;
        }

        return ans;
    }
}
