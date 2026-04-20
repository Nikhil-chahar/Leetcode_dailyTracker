class Solution {
    public int maxDistance(int[] colors) {
        int mx=0;
        int n = colors.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            for(int key : map.keySet()){
                if(key != colors[i]){
                    mx = Math.max(mx,i-map.get(key));
                }
            }
            if(!map.containsKey(colors[i])){
                map.put(colors[i],i);
            }
        }
        return mx;
    }
}