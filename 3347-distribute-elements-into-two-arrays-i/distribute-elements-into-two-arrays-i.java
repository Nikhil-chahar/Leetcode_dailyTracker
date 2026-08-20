class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int i=0,j=0;

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        for(int ind=2;ind<n;ind++){
            if(arr1[i] > arr2[j]){
                arr1[++i] = nums[ind];
            }else{
                arr2[++j] = nums[ind];
            }
        }

        for(i=0;i<n;i++){
            if(arr1[i] == 0){
                j=i;
                break;
            }
            nums[i] = arr1[i];
            
        }
        for(i=0;i<n;i++){
            if(arr2[i] == 0){
                break;
            }
            nums[j++] = arr2[i];
            
        }
        return nums;

    }
}