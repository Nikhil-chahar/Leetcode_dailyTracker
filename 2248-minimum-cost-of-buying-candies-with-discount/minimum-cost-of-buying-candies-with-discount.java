class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;


        int i=cost.length-1;
        for(;i-2>=0;i-=3){
            sum += cost[i];
            sum += cost[i-1];
        }
        while(i >= 0){
            sum += cost[i];
            i--;
        }
        return sum;
    }
}