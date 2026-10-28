class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lMax=0,rMax=0;
        int ans=0;
        while(l<r){
            if(height[l] < height[r]){
                lMax=Math.max(lMax,height[l]);
                ans += lMax-height[l];
                l++;
            }
            else{
                rMax=Math.max(rMax,height[r]);
                ans += rMax-height[r];
                r--;
            }
        }
        return ans;
    }
}