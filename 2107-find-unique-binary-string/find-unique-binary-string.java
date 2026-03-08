class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for(String s : nums){
            set.add(Integer.parseInt(s,2));
        }

        for(int i=0;i<(1<<n);i++){
            if(!set.contains(i)){
                String s =  Integer.toBinaryString(i);
                while(s.length() < n){
                    s = "0"+s;
                }
                return s;
            }
        }
        return "";
    }
}