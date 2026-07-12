class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }
        }
        int ind = 1;
        for(int key : map.keySet()){
            map.put(key,ind++);
        }

        System.out.print(map);
        int ans[] = new int[n];

        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}