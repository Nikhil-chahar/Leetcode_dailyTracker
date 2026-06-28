class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        find(nums,0,ll);
        return ans;
    }
    public void find(int nums[],int i,List<Integer> ll){
        if(i == nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[i]);
        find(nums,i+1,ll);
        ll.remove(ll.size()-1);
        find(nums,i+1,ll);
        
    }
}