class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cnt = 0;
        
        for(char ch : moves.toCharArray()){
            if(ch == 'L' || ch == '_'){
                cnt++;
            }else{
                cnt--;
            }
        }
        int ans = cnt;
        cnt = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'R' || ch == '_'){
                cnt++;
            }else{
                cnt--;
            }
        }
        ans = Math.max(cnt,ans);

        return ans;
    }
}