class Solution {
    public String getHappyString(int n, int k) {
        String s = "abc";
        sub(s,"",-1,n);
        Collections.sort(ll);
        for(String st : ll){
            System.out.println(st);
        }

        return (k-1 < ll.size() ? ll.get(k-1) : "");
    }
    // code for subsequence of string
    List<String> ll = new ArrayList<>();

    public void sub(String s,String ans,int ind,int n){
        if(ans.length() == n){
            ll.add(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            if(i != ind){
                sub(s,ans + s.charAt(i),i,n);
            }
        }
    }
}