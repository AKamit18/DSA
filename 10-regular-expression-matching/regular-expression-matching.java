class Solution {
    public boolean isMatch(String s, String p) {

        int m = s.length();
        int n = p.length();

        // DP table where dp[i][j] means s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty string matches empty pattern

        // Handle patterns like a*, a*b*, a*b*c* that can match an empty string
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2]; // '*' acts as zero occurrences
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);  // Current char in string
                char pc = p.charAt(j - 1);  // Current char in pattern

                if (pc == '.' || pc == sc) {
                    // Characters match or '.' wildcard matches any character
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // '*' can act as:
                    // 1. Zero occurrence of the preceding char: dp[i][j-2]
                    dp[i][j] = dp[i][j - 2];

                    // 2. One or more occurrences if the preceding char matches
                    char prevChar = p.charAt(j - 2);
                    if (prevChar == '.' || prevChar == sc) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
        
    }
}