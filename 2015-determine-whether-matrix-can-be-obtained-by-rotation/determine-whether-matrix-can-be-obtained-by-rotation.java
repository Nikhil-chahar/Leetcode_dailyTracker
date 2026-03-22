class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i=0;i<4;i++){
            if(isEquals(mat,target)) return true;
            mat = rotate(mat);
        }
        return false;
    }
    public int[][] rotate(int mat[][]){
        int n = mat.length;
        int rot[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rot[j][n-i-1] = mat[i][j];
            }
        }
        return rot;
    }
    public boolean isEquals(int mat[][],int tar[][]){

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j] != tar[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}