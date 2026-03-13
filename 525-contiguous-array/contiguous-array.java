class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt =0;
        int mx = 0;

        for(int i=0;i<nums.length;i++){
            cnt += (nums[i] == 0 ? -1 : 1);
            if(cnt== 0){
                mx = Math.max(mx,i+1);
            }else if(map.containsKey(cnt)){
                mx = Math.max(mx,i-map.get(cnt));
            }else{
                map.put(cnt,i);
            }
        }
        return mx;
    }
}