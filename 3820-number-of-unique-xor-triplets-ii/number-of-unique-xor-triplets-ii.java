class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        // int len = n*(n+1)/2;
        int ind = 0; 
        // int arr[] = new int[len];

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // arr[ind++] = nums[i]^nums[j];
                int val = nums[i]^nums[j];
                set.add(val);
            }
        }
        HashSet<Integer> set2 = new HashSet<>();


        for(int v : set){
            for(int j=0;j<n;j++){
                int val = v^nums[j];
                set2.add(val);
            }
        }
        return set2.size();
    }
}         