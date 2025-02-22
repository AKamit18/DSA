class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Map to store the last index of each character
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0; // Stores the maximum length of the substring
        int left = 0; // Left pointer of the sliding window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map, move the left pointer
            if (charIndexMap.containsKey(currentChar)) {
                // Ensure the left pointer doesn't move backward
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }

            // Update the last index of the current character
            charIndexMap.put(currentChar, right);

            // Calculate the current window size and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
        
    }
}