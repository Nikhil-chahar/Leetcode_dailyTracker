class Solution {
    int mx = 0;
    public int maxAreaOfIsland(int[][] grid) {
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    bfs(grid,i,j,1);
                }
            }
        }
        return mx;
    }
    public void bfs(int grid[][],int i,int j,int cnt){

        Queue<int[]> q = new LinkedList<>();
        int row[] = {0,0,-1,1};
        int col[] = {1,-1,0,0};
        grid[i][j] = 0;

        q.add(new int[]{i,j});

        while(!q.isEmpty()){
            int rp[] = q.poll();
            int r = rp[0];
            int c = rp[1];

            for(int k=0;k<4;k++){
                int nr = r+row[k];
                int nc = c + col[k];

                if(nr >=0 && nr < grid.length && nc >=0 && nc < grid[0].length && grid[nr][nc] == 1){
                    grid[nr][nc] = 0;
                    q.add(new int[]{nr,nc});
                    cnt++;
                }
            }
        }
        mx = Math.max(mx,cnt);
    }
}