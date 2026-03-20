class Solution {
//     int r[] = {0,0,-1,1};
//     int c[] = {-1,1,0,0};
    public void solve(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        
        for(int i=0;i<n;i++){
            if(grid[i][0]== 'O'){
                dfs(vis,grid,i,0);
            }
            if(grid[i][m-1] == 'O'){
                dfs(vis,grid,i,m-1);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]== 'O'){
                dfs(vis,grid,0,i);
            }
            if(grid[n-1][i] == 'O'){
                dfs(vis,grid,n-1,i);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == 0 && grid[i][j] == 'O'){
                    grid[i][j] = 'X';
                }
            }
            
        }

    }
    public void dfs(int vis[][],char grid[][],int i,int j){
        if(i < 0 || j <0 || i == grid.length || j == grid[0].length || vis[i][j] ==1 || grid[i][j] == 'X'){
            return;
        }

        vis[i][j]= 1;

        dfs(vis,grid,i+1,j);
        dfs(vis,grid,i-1,j);
        dfs(vis,grid,i,j+1);
        dfs(vis,grid,i,j-1);

    }
}