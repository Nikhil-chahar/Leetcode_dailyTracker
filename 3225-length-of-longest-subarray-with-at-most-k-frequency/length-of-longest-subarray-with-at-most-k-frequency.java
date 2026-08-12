class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int le = 0,ri=0;
        int n = nums.length;
        int mx = 0;

        while(ri < n){
            map.put(nums[ri],map.getOrDefault(nums[ri],0)+1);
            // System.out.println(map);

            while(map.get(nums[ri]) > k){
                map.put(nums[le],map.get(nums[le])-1);
                le++;
            }
            int len = (ri-le+1);
            mx = Math.max(mx,len);
            ri++;
        }

        return mx;
    }
}