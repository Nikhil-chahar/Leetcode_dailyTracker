class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int last[] =new int[26];
        Arrays.fill(last,-1);
        int n = s.length();
        boolean[] vis = new boolean[26];

        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(last[ch-'a'] == -1){
                last[ch-'a'] = i;
            }
        }

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if (vis[ch - 'a']) {
                continue;
            }
            
            while(!st.isEmpty() && st.peek() > ch && last[st.peek()-'a'] > i){
                vis[st.peek() - 'a'] = false;
                st.pop();
            } 
            st.push(ch);
            vis[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}