class Solution {
    public int maxArea(int[] height) {

        int left = 0; // Left pointer
        int right = height.length - 1; // Right pointer
        int maxArea = 0; // Stores the maximum area

        while (left < right) {
            // Calculate the current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update maxArea if the current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
        
    }
}