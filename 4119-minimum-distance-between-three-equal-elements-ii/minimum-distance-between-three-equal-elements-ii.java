class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        // store indices
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int min = Integer.MAX_VALUE;

        // process each value
        for (List<Integer> list : map.values()) {
            int m = list.size();

            if (m >= 3) {
                for (int i = 0; i < m - 2; i++) {
                    int left = list.get(i);
                    int right = list.get(i + 2);

                    int dist = 2 * (right - left);
                    min = Math.min(min, dist);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}