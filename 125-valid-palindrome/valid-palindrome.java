class Solution {
    public boolean isPalindrome(String s) {

         // Edge case: if the string is null or empty, it's a palindrome
        if (s == null || s.isEmpty()) {
            return true;
        }

        // Use two pointers to check for palindrome
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move the left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move the right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters at the two pointers, ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Not a palindrome
            }

            // Move both pointers closer to the center
            left++;
            right--;
        }

        return true; // It's a palindrome
        
        
    }
}