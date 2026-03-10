class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int st=0,en=arr.length-1;
        int cnt=0;

        while(st <= en){
            if(arr[st]+arr[en] <= limit){
                st++;
            }
            en--;
            cnt++;
        }
        return cnt;
    }
}