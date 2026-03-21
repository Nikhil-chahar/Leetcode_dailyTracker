class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n = grid.length;
        int m= grid[0].length;
        int st=x,en=x+k-1;
        while(st < en){
            for(int j=y;j<y+k;j++){
                int temp = grid[st][j];
                grid[st][j] = grid[en][j];
                grid[en][j] = temp;
            }
            st++;
            en--;
        }

        return grid;
    }
}