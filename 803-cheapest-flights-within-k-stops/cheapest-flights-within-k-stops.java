
class Solution {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        for(int ar[] : flights){
            int u = ar[0];
            int v = ar[1];
            int cost = ar[2];
            map.get(u).put(v,cost);
        }
        // System.out.print(map);

        return dij(n,src,dst,k);
    }
    public int dij(int n,int src,int des,int k){
        Queue<Pair> q = new LinkedList<>();
        int dist[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        int st = 0;
        dist[src] = 0;

        q.add(new Pair(src,0));

        while(!q.isEmpty() && k >= st){
            int si = q.size();
            int temp[] = dist.clone();

            for(int i=0;i<si;i++){
                Pair rp = q.poll();

                for(int nbrs : map.get(rp.vtx).keySet()){
                    int ct = map.get(rp.vtx).get(nbrs);
                    if(rp.cost+ct < temp[nbrs]){
                        temp[nbrs] = rp.cost+ct;
                        q.add(new Pair(nbrs,rp.cost+ct));
                    }
                    
                }
            }
            dist = temp;
            st++;
        }

        return  dist[des] == Integer.MAX_VALUE ? -1 : dist[des];

    }
    class Pair{
        int vtx;
        int cost;
        // int st;
        public Pair(int vtx,int cost){
            this.vtx = vtx;
            this.cost = cost;
            // this.st= st;
        }
       
    }
}