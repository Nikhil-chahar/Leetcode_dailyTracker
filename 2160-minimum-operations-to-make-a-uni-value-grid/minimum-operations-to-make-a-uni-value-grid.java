class Solution {
    public int minOperations(int[][] grid, int x) {
        
        int n = grid.length;
        int m = grid[0].length;
        if(n*m <=1) return 0;
        int rem = grid[0][0]%x;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]%x !=rem) return -1;
            }
        }

        List<Integer> ll = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ll.add(grid[i][j]);
            }
        }
        Collections.sort(ll);
        int mid = ll.get(ll.size()/2);
        int min = 0;
        for(int val : ll){
            min += (Math.abs(val - mid) /x);
        }
        // System.out.print(mid);

        return min;
    }
}