class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        if(arr[0] != 1){
            // arr[n-1] = arr[0];
            arr[0]=1;
        }
        Arrays.sort(arr);
        int mx = 1;

        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1] > 1){
                arr[i] = arr[i-1]+1;
            }
            mx = Math.max(arr[i],mx);
        }
        return mx;
    }
}