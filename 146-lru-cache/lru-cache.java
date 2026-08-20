class LRUCache {
    HashMap<Integer, int[]> map;
    int cap;
    int pr = 0;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        int[] ar = map.get(key);
        ar[1] = pr++;
        return ar[0];
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            int[] ar = map.get(key);
            ar[0] = value;
            ar[1] = pr++;
            return;
        }

        if (map.size() == cap) {
            remove();
        }

        map.put(key, new int[]{value, pr++});
    }

    public void remove() {
        int min = Integer.MAX_VALUE;
        int rkey = -1;

        for (int key : map.keySet()) {
            int[] ar = map.get(key);

            if (ar[1] < min) {
                min = ar[1];
                rkey = key;
            }
        }

        map.remove(rkey);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */