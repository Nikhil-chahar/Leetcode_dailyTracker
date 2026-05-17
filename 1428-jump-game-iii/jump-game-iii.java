class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean vis[] = new boolean[arr.length];
        return dfs(start,vis,arr);
    }
    public boolean dfs(int ind,boolean vis[],int arr[]){
        if(ind < 0 || ind >= arr.length || vis[ind]){
            return false;
        }
        if(arr[ind] == 0){
            return true;
        }
        vis[ind] = true;

        return dfs(ind+arr[ind],vis,arr) || dfs(ind-arr[ind],vis,arr);
    }
}