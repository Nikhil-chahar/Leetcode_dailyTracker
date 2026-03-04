class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int cnt =0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1 && isSpecial(mat,i,j,n,m)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public boolean isSpecial(int mat[][],int i,int j,int r,int c){

        for(int k=0;k<c;k++){
            if(k == j) continue;
            if(mat[i][k] == 1) return false;
        }
        for(int k=0;k<r;k++){
            if(k == i) continue;
            if(mat[k][j] == 1) return false;
        }
        return true;
    }
}