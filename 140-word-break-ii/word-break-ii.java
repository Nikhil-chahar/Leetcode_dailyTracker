class Solution {
    List<String> res;
    public List<String> wordBreak(String s, List<String> wordDict) {
        String ans = "";
        res = new ArrayList<>();

        for(String st : wordDict){
            if(s.indexOf(st) == 0){
                rec(s.substring(st.length()),ans+st,wordDict);
            }
        }

        return res;
    }

    public void rec(String s,String ans,List<String> wordDict){
        if(s.length() == 0){
            res.add(ans.trim());
            return;
        }
        
        for(String st : wordDict){
            int ind = s.indexOf(st);
            if(ind == 0){
                rec(s.substring(st.length()),ans+" "+st,wordDict);
            }
        }
    }
}