class Solution {
    public int lengthOfLastWord(String s) {

        // Remove leading and trailing spaces
        s = s.trim();
        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(" ");
        // Return the length of the last word
        return s.length() - lastSpaceIndex - 1; 
        
    }
}