class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        long ans = 0;
        long leftValid = 0;
        HashMap<Long,Long> map = new HashMap<>();
        map.put(0L,1L);
        long cumSum = 0;


        for(int i=0;i<n;i++){
            if(nums[i] == target){
                leftValid += map.get(cumSum);
                cumSum += 1;
            }
            else{
                cumSum-=1;
                leftValid -= map.getOrDefault(cumSum,0L);
            }

            ans += leftValid;
            map.put(cumSum,map.getOrDefault(cumSum,0L)+1);
        }

        return ans;

    }
}