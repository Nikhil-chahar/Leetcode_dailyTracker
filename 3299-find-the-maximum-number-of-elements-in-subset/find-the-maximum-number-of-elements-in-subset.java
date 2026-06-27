class Solution {
    public int maximumLength(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int cnt=0;

        for(int v : nums){
            if(v == 1){
                cnt++;
            }else{
                map.put(v,map.getOrDefault(v,0)+1);
            }
        }

        int ans = cnt;
        if(cnt%2==0){
            ans = cnt-1;
        }

        for(int key : map.keySet()){
            int v = key;
            int level=0;

            for(;;v*=v){
                int c = 0;
                if(map.containsKey(v)){
                    c = map.get(v);
                }

                if(c >= 2){
                    level +=2;
                }else if(c == 1){
                    level+=1;
                    break;
                }else{
                    break;
                }

            }
            if(level%2==0){
                level = level-1;
            }
            ans= Math.max(ans,level);
        }
        return ans;
    }
}