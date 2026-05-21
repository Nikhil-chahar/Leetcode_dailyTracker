class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            String s = String.valueOf(arr1[i]);

            String pr = "";
            for(char ch : s.toCharArray()){
                pr+= ch;
                set.add(pr);
            }
        }
        int ans = 0;

        for(int i=0;i<arr2.length;i++){
            String s = String.valueOf(arr2[i]);

            String pr = "";

            for(char ch : s.toCharArray()){
                pr += ch;
                if(set.contains(pr)){
                    ans = Math.max(ans,pr.length());
                }
            }
        }
        return ans;
    }
}