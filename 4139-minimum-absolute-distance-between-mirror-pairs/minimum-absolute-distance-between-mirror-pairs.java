class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int mn = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            // int re = rev(nums[i]);
            // System.out.println(re);
            if(map.containsKey(nums[i])){
                mn = Math.min(mn,i-map.get(nums[i]));
            }
            map.put(rev(nums[i]),i);
        }
        return mn == Integer.MAX_VALUE ? -1 : mn;
    }
    public int rev(int num){
        int re = 0;
        while(num > 0){
            int tem = num%10;
            re= re*10 + tem;
            num/=10;
        }
        return re;
    }
}