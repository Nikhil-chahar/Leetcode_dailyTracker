class Solution {
    public int rotatedDigits(int n) {
        
        int ans[] = new int[n+1];

        for(int i=1;i<=n;i++){
            if(isGood(i)){
                ans[i]+=1;
            }
            ans[i]+=ans[i-1];
            // System.out.println(ans[i]);
        }
        return ans[n];
    }
    public boolean isGood(int n){
        String s = String.valueOf(n);
        HashSet<Character> set = new HashSet<>(Arrays.asList('3','4','7'));
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                return false;
            }
            else if(ch == '2'){
                sb.append('5');
            }
            else if(ch == '5'){
                sb.append('2');
            }else if(ch == '6'){
                sb.append('9');
            }else if(ch == '9'){
                sb.append('6');
            }else{
                sb.append(ch);
            }
        }
        int val = Integer.parseInt(sb.toString());
        if(val == n) return false;
        return true;
    }
}