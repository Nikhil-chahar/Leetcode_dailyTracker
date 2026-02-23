class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(k==0){
            return true;
        }
        int pow = (int)Math.pow(2,k);

        boolean find[] = new boolean[pow];
        for(int i=0;i<=s.length()-k;i++){
            String sub = s.substring(i,i+k);
            int val = Integer.parseInt(sub,2);
            find[val] = true;
        }
        for(int i=0;i<pow;i++){
            if(!find[i]){
                return false;
            }
        }

        return true;
    }
}