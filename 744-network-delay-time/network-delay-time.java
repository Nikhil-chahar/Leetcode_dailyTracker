class Solution {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public int networkDelayTime(int[][] times, int n, int k) {
        map = new HashMap<>();

        for(int i=1;i<=n;i++){
            map.put(i,new HashMap<>());
        }

        
        for(int ar[] : times){
            int u = ar[0];
            int v = ar[1];
            int cost = ar[2];
            map.get(u).put(v,cost);
        }

        return dij(k);
    }
    public int dij(int src){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.cost-b.cost);
        int mx = 0;

        pq.add(new Pair(src,0));
        HashSet<Integer> vis = new HashSet<>();

        while(!pq.isEmpty()){
            Pair rp = pq.poll();

            if(vis.contains(rp.vtx)){
                continue;
            }
            vis.add(rp.vtx);

            mx = Math.max(mx,rp.cost);

            for(int nbrs : map.get(rp.vtx).keySet()){
                if(!vis.contains(nbrs)){
                    int ct = map.get(rp.vtx).get(nbrs);
                    pq.add(new Pair(nbrs,rp.cost+ct));
                }
            }
        }
        if(vis.size() != map.size()) return -1;
        return mx;

    }
    class Pair{
        int vtx;
        int cost;
        public Pair(int vtx,int cost){
            this.vtx = vtx;
            this.cost = cost;
        }
    }
}