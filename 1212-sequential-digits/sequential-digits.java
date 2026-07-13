class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> ll = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                int val = Integer.parseInt(s.substring(i,j));
                // System.out.println(val);

                if(val >= low && val <= high){
                    ll.add(val);
                }
            }
        }
        Collections.sort(ll);
        return ll;
    }
}