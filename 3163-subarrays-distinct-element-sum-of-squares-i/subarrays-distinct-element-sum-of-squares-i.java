class Solution {
    public int sumCounts(List<Integer> nums) {
        int val =0;
        int n = nums.size();
        for(int i=0;i<n;i++){
            HashSet<Integer> s = new HashSet<>();
            for(int j=i;j<n;j++){
                s.add(nums.get(j));
                val += (s.size()*s.size());
            }
        }
        return val;
    }
}