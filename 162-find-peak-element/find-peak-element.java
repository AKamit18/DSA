class Solution {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check the relationship between nums[mid] and nums[mid + 1]
            if (nums[mid] > nums[mid + 1]) {
                // Move left as the peak is on the left side (or mid itself)
                right = mid;
            } else {
                // Move right as the peak is on the right side
                left = mid + 1;
            }
        }

        // At the end, left == right, pointing to a peak element
        return left;
        
        
    }
}