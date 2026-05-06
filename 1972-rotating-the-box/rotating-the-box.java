class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        char ans[][] = new char[m][n];

        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(grid[i][j] == '.' && j !=0){
                    int st = j-1;
                    boolean fl = false;
                    while(st >=0){
                        if(grid[i][st] == '#'){
                            fl = true;
                            break;
                        }
                        if(grid[i][st] == '*'){
                            break;
                        }
                        st--;
                    }
                    if(fl){
                        grid[i][st] = '.';
                        grid[i][j] = '#';
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-1-i] = grid[i][j];
            }
        }
        
        return ans;
    }
}