class Solution {
    public int shortestPath(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0] == 1 || grid[n-1][m-1] == 1){
            return -1;
        }
        boolean vis[][][] = new boolean[n][m][k+1];
        Queue<Pair> q = new LinkedList<>();
        int row[] = {-1,1,0,0};
        int col[] = {0,0,-1,1};
        q.add(new Pair(0,0,0,k));
        vis[0][0][k] = true;

        while(!q.isEmpty()){
            Pair rp = q.poll();
            int r = rp.r;
            int c = rp.c;
            int st = rp.st;
            int rem = rp.rem;
            
            if(r == n-1 && c == m-1){
                return st;
            }

            for(int i=0;i<4;i++){
                int nr = r+row[i];
                int nc = c + col[i];

                if(nr >=0 && nc >=0 && nr < n && nc <m){
                    int nk = rem;
                    if(grid[nr][nc] == 1 ){
                        if(nk == 0) continue;
                        nk--;
                    }
                    if(!vis[nr][nc][nk]){
                        vis[nr][nc][nk] = true;
                        q.add(new Pair(nr,nc,st+1,nk));
                    }

                }
            }
        }
        return -1;
    }
    class Pair{
        int r;
        int c;
        int st;
        int rem;
        public Pair(int r,int c,int st,int rem){
            this.r = r;
            this.c = c;
            this.st = st;
            this.rem = rem;
        }

    }
}