class Solution {
    public int maxPalindromes(String s, int k) {
        int ans = 0;
        int n = s.length();
        boolean fl[] = new boolean[n];

        for(int i=0;i<=n-k;i++){
            // if(fl[i]){
            //     continue;
            // }
            for(int j=i+k;j<=Math.min(n,i+k+1);j++){
                String sub = s.substring(i,j);
                if(isPalin(sub)){
                    // make visit
                    // for(int l=i;l<j;l++){
                    //     fl[l] = true;
                    // }
                    ans++;
                    i = j-1;
                    break;
                }
                // System.out.println(sub);
            }
        }
        return ans;
    }
    public boolean isPalin(String s){
        int i=0,j = s.length()-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}