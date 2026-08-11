class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int pre[] =  new int[n];
        HashSet<Integer> set = new HashSet<>();

        pre[0]= nums[0];
        int ans = nums[0];

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                pre[i] = pre[i-1]+nums[i];
                ans = pre[i];
            }else{
                break;
            }
        }
        // System.out.println(set);
        // System.out.print(ans);

        while(set.contains(ans)){
            ans++;
        }


        // for(int i=0;i<n;i++){
        //     System.out.print(pre[i]+ " ");
        // }

        // return nums[nums.length-1]+1;
        return ans;
    }
}