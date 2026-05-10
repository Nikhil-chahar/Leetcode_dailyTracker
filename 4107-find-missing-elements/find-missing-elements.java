class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for(int val : nums){
            set.add(val);
            mn = Math.min(mn,val);
            mx = Math.max(mx,val);
        }

        for(int i=mn;i<=mx;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        
        return ans;
    }
}