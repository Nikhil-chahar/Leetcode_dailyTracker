class Solution {
    int time = 0;
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int row[] = {0,0,1,-1};
        int col[] = {1,-1,0,0};


        while(!q.isEmpty()){
            int si = q.size();
            boolean sp = false;
            for(int i=0;i<si;i++){   
                int rp[] = q.poll();
                int r = rp[0];
                int c = rp[1];

                for(int k=0;k<4;k++){
                    int nr = r + row[k];
                    int nc = c + col[k];

                    if(nr>=0 && nr < grid.length && nc>=0 && nc< grid[0].length && grid[nr][nc] ==1){
                        grid[nr][nc] = 2;
                        sp =true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            if(sp) time++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return time;
    }
}