class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }

        int mx = 0;

        for(int i=0;i<n;i++){
            List<Integer> ll = new ArrayList<>();
            for(int j=0;j<m;j++){
                ll.add(matrix[i][j]);
            }

            Collections.sort(ll,(a,b) -> b-a);
            
            int wid = 1;
            for(int val : ll){
                mx = Math.max(mx,val*wid);
                wid++;
            }
        }

        return mx;

    }
}