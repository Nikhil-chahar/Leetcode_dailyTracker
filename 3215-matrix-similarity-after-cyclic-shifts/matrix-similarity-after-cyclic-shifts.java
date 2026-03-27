class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        // int cp[][] = mat.clone();
        int n = mat.length;
        int m = mat[0].length;
        
        int cp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                cp[i][j] = mat[i][j];
            }
        }

        while(k-- > 0){
            for(int i=0;i<n;i++){
                if(i%2==0){
                    int temp = mat[i][0];
                    for(int j =0;j<m-1;j++){
                        mat[i][j] = mat[i][j+1];
                    }
                    mat[i][m-1] = temp;
                }else{
                    int temp = mat[i][m-1];
                    for(int j =m-1;j>0;j--){
                        mat[i][j] = mat[i][j-1];
                    }
                    mat[i][0] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // System.out.print(cp[i][j] +" ");
                if(mat[i][j] != cp[i][j]) return false;
            }
            System.out.println();
        }
        return true;
    }
}