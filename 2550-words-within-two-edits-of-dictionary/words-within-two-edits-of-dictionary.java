class Solution {
    public List<String> twoEditWords(String[] q, String[] dict) {
        List<String> ans = new ArrayList<>();

        for(String s : q){
            int n = s.length();
            for(String word : dict){
                int cnt = 0;
                for(int i=0;i<n;i++){
                    if(s.charAt(i) != word.charAt(i)){
                        cnt++;
                    }
                }
                if(cnt <= 2){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
}