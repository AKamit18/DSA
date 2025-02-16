class Solution {
    public int jump(int[] nums) {

        int n = nums.length;
        if (n <= 1) {
            return 0; // No jumps needed if there's only one element or no element
        }

        int[] dp = new int[n]; // dp[i] stores the minimum jumps to reach index i

        // Initialize dp[0] to 0, as we start at index 0
        dp[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            if (dp[i] == 0 && i > 0) continue; //if we cannot reach this index, skip it
            for (int j = 1; j <= nums[i] && i + j < n; j++) {
                int nextIndex = i + j;

                if (dp[nextIndex] == 0) {
                    dp[nextIndex] = dp[i] + 1;
                } else {
                    dp[nextIndex] = Math.min(dp[nextIndex], dp[i] + 1);
                }

                if(nextIndex == n -1 ) return dp[nextIndex]; // optimization: if we reach the end, return immediately
            }
        }

       return dp[n - 1];
    }


    // More Optimized Solution (Greedy Approach):
    public int jumpOptimized(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }

        int jumps = 0;
        int currentReach = 0; // Furthest reachable index with current jumps
        int farthestReach = 0; // Furthest reachable index overall

        for (int i = 0; i < n - 1; i++) {
            farthestReach = Math.max(farthestReach, i + nums[i]);

            if (i == currentReach) { // We've reached the limit of our current jump
                jumps++;
                currentReach = farthestReach;

                if (currentReach >= n - 1) { //Optimization: if we reach the end, return immediately
                    return jumps;
                }
            }
        }

        return jumps;
    }
}

