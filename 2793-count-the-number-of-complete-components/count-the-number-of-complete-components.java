class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }

        for(int a[] : edges){
            int u = a[0];
            int v = a[1];
            map.get(u).add(v);
            map.get(v).add(u);
        }

        System.out.println(map);

        HashSet<Integer> vis = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();

        int c = 0;

        for(int i=0;i<n;i++){
            if(vis.contains(i)){
                continue;
            }

            q.add(i);
            // c++;
            int no = 0;
            int ed = 0;

            while(!q.isEmpty()){
                int rp = q.poll();

                if(vis.contains(rp)){
                    continue;
                }
                no++;
                vis.add(rp);

                // work

                for(int nbrs : map.get(rp)){
                    if(!vis.contains(nbrs)){
                        q.add(nbrs);
                        ed++;
                    }
                }
            }
            if(ed == no*(no-1)/2){
                c++;
            }
            // System.out.println(no +" "+ ed);
        }

        return c;
    }
}