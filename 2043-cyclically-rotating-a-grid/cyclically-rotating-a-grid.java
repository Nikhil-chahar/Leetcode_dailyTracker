class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        
        int st_row = 0;
        int st_col =0;
        int en_row=n;
        int en_col = m;
        // int mxcnt = 2*m + 2*(n-2);
        int n_row=n;
        int n_col = m;
        ArrayList<Integer> ll = new ArrayList<>();

        while(st_row < n/2 && st_col < m/2){

            int r=st_row,c=st_col,cnt = 0;

            int mxcnt = 2*n_col + 2*(n_row-2);

            while(cnt < mxcnt){
                while(c < en_col && cnt < mxcnt){
                    System.out.println(r +" "+c);
                    ll.add(grid[r][c]);
                    cnt++;
                    c++;
                }
                c--;
                r++;
                while(r < en_row && cnt < mxcnt){
                    System.out.println(r +" "+c);
                    ll.add(grid[r][c]);
                    cnt++;
                    r++;
                }
                r--;
                c--;
                while(c >=st_col && cnt < mxcnt){
                    System.out.println(r +" "+c);
                    ll.add(grid[r][c]);
                    cnt++;
                    c--;
                }
                c++;
                r--;

                while(r>=st_row && cnt < mxcnt){
                    System.out.println(r +" "+c);
                    ll.add(grid[r][c]);
                    cnt++;
                    r--;
                }
            }
            int mr = k%mxcnt;

            int rot =0;
            while(rot++ < mr){
                ll.add(ll.get(0));
                ll.remove(0);
            }
            cnt = 0;
            r=st_row;
            c=st_col;
            int ind = 0;
            while(cnt < mxcnt){
                while(c < en_col && cnt < mxcnt){
                    ll.add(grid[r][c]);
                    // System.out.println(r +" "+c);
                    grid[r][c] = ll.get(ind++);
                    cnt++;
                    c++;
                }
                c--;
                r++;
                while(r < en_row && cnt < mxcnt){
                    ll.add(grid[r][c]);
                    grid[r][c] = ll.get(ind++);
                    // System.out.println(r +" "+c);
                    cnt++;
                    r++;
                }
                r--;
                c--;
                while(c >=st_col && cnt < mxcnt){
                    ll.add(grid[r][c]);
                    grid[r][c] = ll.get(ind++);
                    // System.out.println(r +" "+c);
                    cnt++;
                    c--;
                }
                c++;
                r--;

                while(r>=st_row && cnt < mxcnt){
                    ll.add(grid[r][c]);
                    grid[r][c] = ll.get(ind++);
                    // System.out.println(r +" "+c);
                    cnt++;
                    r--;
                }
            }
            ll.clear();
            st_row++;
            st_col++;
            en_row--;
            en_col--;
            n_row-=2;
            n_col-=2;
        }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(grid[i][j] +" ");
        //     }
        //     System.out.println();
        // }

        // System.out.print(ll);

        return grid;
    }
}