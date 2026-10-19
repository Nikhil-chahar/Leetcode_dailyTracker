class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ll = new ArrayList<>();
        // Arrays.sort(nums);
        int n = nums.length;
        int sm = 0;
        int la = 0;


        for(int i=0;i<n;i++){
            if(nums[i] < target){
                sm++;
            }else if(nums[i] > target){
                la++;
            }
        }

        for(int i=sm;i<n-la;i++){
            ll.add(i);
        }
        return ll;
    }
}