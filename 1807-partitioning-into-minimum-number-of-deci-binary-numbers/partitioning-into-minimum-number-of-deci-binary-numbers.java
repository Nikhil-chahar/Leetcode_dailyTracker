class Solution {
    public int minPartitions(String n) {
        
        int mx = 0;
        for(char ch : n.toCharArray()){
            int val = ch-'0';
            if(mx < val){
                mx = val;
            }
        }
        return mx;
    }
}