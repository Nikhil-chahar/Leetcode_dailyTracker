class Solution {
    public int minimumEffortPath(int[][] height) {
        int n = height.length,m = height[0].length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.diff-b.diff);
        pq.add(new Pair(0,0,0));
        int ro[] = {0,0,-1,1};
        int col[] = {-1,1,0,0};

        int dist[][] = new int[n][m];
        for(int a[] : dist){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        dist[0][0] = 0;

        while(!pq.isEmpty()){
            Pair rp = pq.poll();

            int di = rp.diff;
            int r = rp.row;
            int c = rp.col;

            if(r== n-1 && c == m-1){
                return di;
            }

            for(int i=0;i<4;i++){
                int nr = r + ro[i];
                int nc = c + col[i];

                if(nr >= 0 && nc >= 0 && nr < n && nc < m){
                    int nd = Math.abs(height[r][c] - height[nr][nc]);
                    int mx = Math.max(nd,di);
                    if(mx < dist[nr][nc]){
                        dist[nr][nc] = mx;
                        pq.add(new Pair(mx,nr,nc));
                    }
                    
                }
            }
        }
        return 1;
    }
    class Pair{
        int diff;
        int row;
        int col;
        public Pair(int diff,int row,int col){
            this.diff = diff;
            this.row = row;
            this.col = col;
        }
    }
}