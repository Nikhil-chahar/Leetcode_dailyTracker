class Solution {
    public int maxNumberOfFamilies(int n, int[][] res) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();

        for(int ar[] : res){
            // map.computeIfAbsent(ar[0],k->new HashSet<>()).add(ar[1]);
            if(!map.containsKey(ar[0])){
                map.put(ar[0],new HashSet<>());
            }
            map.get(ar[0]).add(ar[1]);
        }

        int ans = (n-map.size())*2; // means these rows which are not available in map

        for(int key : map.keySet()){

            HashSet<Integer> set = map.get(key);

            boolean le = true;
            boolean mid = true;
            boolean ri = true;

            for(int i=2;i<=5;i++){
                if(set.contains(i)){
                    le = false;
                }
            }
            for(int i=4;i<=7;i++){
                if(set.contains(i)){
                    mid = false;
                }
            }
            for(int i=6;i<=9;i++){
                if(set.contains(i)){
                    ri = false;
                }
            }

            if(le && ri){
                ans +=2;
            }else if(le || ri){
                ans+=1;
            }else if(mid){
                ans+=1;
            }
        }

        return ans;
    }
}