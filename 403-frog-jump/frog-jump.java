class Solution {
    int n;
    HashMap<Integer,Integer> map;
    Boolean vis[][];

    public boolean canCross(int[] stones) {
        map = new HashMap<>();
        n = stones.length;
        for(int i=0;i<n;i++){
            map.put(stones[i],i);
        }
        
        vis = new Boolean[n][n+1];
        
        return find(0,0,stones);

    }

    public boolean find(int k,int ind,int stones[]){
        if(ind == n-1){
            return true;
        }
        if(vis[ind][k] != null){
            return vis[ind][k];
        }

        for(int i=k-1;i<=k+1;i++){
            if(i <= 0){
                continue;
            }
            int nx = stones[ind]+i;

            if(map.containsKey(nx)){
                int nind = map.get(nx);

                if(find(i,nind,stones)){
                    return vis[ind][k] = true;
                }
            }
        }
        return vis[ind][k] = false;
    }
}