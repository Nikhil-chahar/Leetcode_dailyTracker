class Solution {
    public int maxProduct(int n) {
        int pro = 1;
        int fi = 0;
        int se = 0;

        while(n > 0){
            int tem = n%10;

            if(tem > fi){
                se = fi;
                fi = tem;
            }
            else if(tem > se){
                se = tem;
            }
            n/=10;
        }
        return fi*se;
    }
}