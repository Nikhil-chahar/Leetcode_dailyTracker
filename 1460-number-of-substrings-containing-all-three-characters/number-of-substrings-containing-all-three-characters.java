class Solution {
    public int numberOfSubstrings(String s) {
        //int count=0;
        int ans=0;
        int right=0;
        int left=0;
        HashMap<Character,Integer>hm=new HashMap<>();

        while(right<s.length()){
            if(hm.containsKey(s.charAt(right))){
                int count=hm.get(s.charAt(right))+1;
                hm.put(s.charAt(right),count);
            }
            else{
                hm.put(s.charAt(right),1);
            }
            while(hm.size()==3){
                ans+=s.length()-right;
                Character ch=s.charAt(left);
                if(hm.containsKey(ch)){
                    int count=hm.get(ch)-1;
                    if(count==0){
                        hm.remove(ch);
                    }
                    else{
                        hm.put(ch,count);
                    }
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}