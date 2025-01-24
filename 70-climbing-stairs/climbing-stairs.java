class Solution {
    public int climbStairs(int n) {
        
        if (n <= 2) {
            return n; // If there are 1 or 2 steps, the number of ways equals n.
        }

        int[] dp = new int[n + 1];
        dp[1] = 1; // 1 way to climb 1 step
        dp[2] = 2; // 2 ways to climb 2 steps

        // Fill the dp array iteratively
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}