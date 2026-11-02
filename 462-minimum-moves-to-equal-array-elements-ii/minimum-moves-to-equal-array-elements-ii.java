class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int move = 0;
        Arrays.sort(nums);

        if(n== 1){
            return 0;
        }

        if(n%2==0){
            move = find(nums,n/2);
        }else{
            move = Math.min(find(nums,n/2),find(nums,n/2 +1));
        }

        return move;
    }
    public int find(int nums[],int mid){
        int move = 0;
        for(int i=0;i<nums.length;i++){
            if(i != mid){
                move += Math.abs(nums[mid]-nums[i]);
            }
        }
        return move;
    }
}