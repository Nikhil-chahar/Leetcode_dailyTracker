class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(9*num < sum){
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<num;i++){
            if(sum > 9){
                sum-=9;
                sb.append(9);
            }else if(sum > 0){
                // s+=sum;
                sb.append(sum);
                sum -= 9;
            }else{
                // s+=0;
                sb.append(0);
            }
        }

        return sb.toString();
    }
    
}