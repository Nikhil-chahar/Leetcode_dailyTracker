class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> ll = new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                ll.add(grid[i][j]);
            }
        }
        int sz = ll.size();
        k %= sz;
        k = (sz-k);

        for(int i=0;i<grid.length;i++){
            List<Integer> nl = new ArrayList<>();
            for(int j =0;j<grid[0].length;j++){
                grid[i][j] = ll.get(k%sz);
                nl.add(grid[i][j]);
                k++;
            }
            ans.add(new ArrayList<>(nl));
        }

        return ans;


        
    }
}