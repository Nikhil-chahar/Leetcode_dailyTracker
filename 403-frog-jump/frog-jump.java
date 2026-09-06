import java.util.*;

class Solution {

    int n;
    Map<Integer, Integer> map;
    Boolean[][] dp;

    public boolean canCross(int[] stones) {

        n = stones.length;

        // stone position -> index
        map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        // dp[index][lastJump]
        dp = new Boolean[n][n + 1];

        return solve(0, 0, stones);
    }

    private boolean solve(int index, int lastJump, int[] stones) {

        // Reached the last stone
        if (index == n - 1) {
            return true;
        }

        // Already solved this state
        if (dp[index][lastJump] != null) {
            return dp[index][lastJump];
        }

        // Try lastJump - 1, lastJump, lastJump + 1
        for (int jump = lastJump - 1;
             jump <= lastJump + 1;
             jump++) {

            // Jump distance must be positive
            if (jump <= 0) {
                continue;
            }

            int nextPosition = stones[index] + jump;

            // Does this stone exist?
            if (map.containsKey(nextPosition)) {

                int nextIndex = map.get(nextPosition);

                if (solve(nextIndex, jump, stones)) {
                    return dp[index][lastJump] = true;
                }
            }
        }

        return dp[index][lastJump] = false;
    }
}