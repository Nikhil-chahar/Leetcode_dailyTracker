class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
            
        }
        int val = k;
        while(set.contains(val)){
            val+=k;
        }
        return val;
    }
}