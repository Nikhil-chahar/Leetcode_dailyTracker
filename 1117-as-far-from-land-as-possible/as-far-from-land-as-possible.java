class Solution {
    int row[] = {0,0,-1,1};
    int col[] = {-1,1,0,0};
    public int maxDistance(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1) q.add(new int[]{i,j});
            }
        }

        if(q.isEmpty() || q.size() == m*n) return -1;

        int cnt = 0;

        while(!q.isEmpty()){
            int si = q.size();
            boolean fl = false;
            for(int i=0;i<si;i++){
                int rv[] = q.poll();
                int r = rv[0];
                int c = rv[1];

                for(int j=0;j<4;j++){
                    int nr = r + row[j];
                    int nc = c + col[j];

                    if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0){
                        grid[nr][nc] = 1;
                        fl = true;
                        q.add(new int[]{nr,nc});
                    }
                }
                
            }
            if(fl) cnt++;
        }
        return cnt;
    }
}