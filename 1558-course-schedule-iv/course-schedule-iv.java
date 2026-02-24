class Solution {
    List<List<Integer>> map;
    public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] queries) {
        map = new ArrayList<>();

        for(int i=0;i<n;i++){
            map.add(new ArrayList<>());
        }
        List<Boolean> ans = new ArrayList<>();

        for(int ed[] : pre){
            map.get(ed[0]).add(ed[1]);
        }

        for(int qr[] : queries){
            ans.add(validPath(qr[0],qr[1]));
        }

        return ans;
    }
    public boolean validPath(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        HashSet<Integer> vis = new HashSet<>();
        
        while(!q.isEmpty()){
            int rv = q.poll();

            if(vis.contains(rv)){
                continue;
            }

            vis.add(rv);

            if(rv == des){
                return true;
            }

            for(int nbrs : map.get(rv)){
                if(!vis.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
}