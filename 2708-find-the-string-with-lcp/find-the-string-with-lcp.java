class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char word[] = new char[n];
        Arrays.fill(word,'$');

        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){
                if(lcp[i][j] != 0){
                    word[i] = word[j];
                    break;
                }
            }
            if(word[i] == '$'){
                boolean fob[] = new boolean[26];

                for(int j=0;j<i;j++){
                    if(lcp[j][i] == 0){
                        fob[word[j]-'a'] = true;
                    }
                }

                for(int j=0;j<26;j++){
                    if(fob[j] == false){
                        word[i] = (char)(j +'a');
                        break;
                    }
                }

                if(word[i] == '$'){
                    return "";
                }
            }
        }
        String ans = new String(word);

        return isPos(word,lcp) ? ans : "";
    }
    public boolean isPos(char word[],int lcp[][]){
        int n = word.length;
        int dp[][] = new int[n+1][n+1];

        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(word[i] == word[j]){
                    dp[i][j] = 1+dp[i+1][j+1];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j] != lcp[i][j]) return false;
            }
            // System.out.println();
        }
        return true;
    }
}