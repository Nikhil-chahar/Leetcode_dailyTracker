class Solution {
    public int maxProduct(int n) {
        List<Integer> ll = new ArrayList<>();

        while(n > 0){
            int tem = n%10;
            ll.add(tem);
            n/=10;
        }
        Collections.sort(ll);
        int sz = ll.size();
        return ll.get(sz-1)*ll.get(sz-2);
    }
}