class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Array to store character counts for 'a' to 'z'
        int[] charCounts = new int[26];
        
        // Count characters in the magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            charCounts[c - 'a']--; // Use one character
            
            if (charCounts[c - 'a'] < 0) {
                // Not enough characters in the magazine
                return false;
            }
        }
        
        // All characters matched
        return true;
        
    }
}