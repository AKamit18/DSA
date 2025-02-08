class Solution {
    public boolean canJump(int[] nums) {

        // Memoization array to store the result for each index
        Boolean[] memo = new Boolean[nums.length];
        return canReach(nums, 0, memo);
        
    }

    // Recursive function to check if it's possible to reach the last index
    private boolean canReach(int[] nums, int index, Boolean[] memo) {
        // If we are already at or past the last index, return true
        if (index >= nums.length - 1) {
            return true;
        }
        
        // If this index has been computed already, return the cached result
        if (memo[index] != null) {
            return memo[index];
        }
        
        // Maximum number of steps we can jump from the current index
        int maxJump = nums[index];
        
        // Try all possible jumps from the current index
        for (int i = 1; i <= maxJump; i++) {
            // If we can reach the last index by jumping i steps, return true
            if (canReach(nums, index + i, memo)) {
                memo[index] = true; // Cache the result as true
                return true;
            }
        }
        
        // If no valid jump leads to the last index, return false
        memo[index] = false; // Cache the result as false
        return false;
    }
}