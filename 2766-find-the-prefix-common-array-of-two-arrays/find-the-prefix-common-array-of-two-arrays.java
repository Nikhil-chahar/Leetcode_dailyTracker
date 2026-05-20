class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        // int cnt = 0;
        int n = A.length;

        int ans[] = new int[n];

        for(int i=0;i<n;i++){
            set.add(A[i]);
            int cnt = 0;
            for(int j=0;j<=i;j++){
                if(set.contains(B[j])){
                    cnt++;
                }
            }
            ans[i]= cnt;
        }
        return ans;
    }
}