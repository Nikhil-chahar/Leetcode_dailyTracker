class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() < 3){
            return s;
        }
        int len = s.length();
        TreeMap<Character,Integer> map = new TreeMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ans[] = new char[len];
        int le = 0;
        int ri = len-1;

        char mid = 0;

        for(char ch : map.keySet()){
            int n = map.get(ch);

            for(int i = 0; i < n / 2; i++){
                ans[le++] = ch;
                ans[ri--] = ch;
            }

            if(n % 2 == 1){
                mid = ch;
            }
        }

        if(mid != 0){
            ans[le] = mid;   // le == ri here
        }

        // System.out.print(map);
        String res = new String(ans);

        return res;
    }
}