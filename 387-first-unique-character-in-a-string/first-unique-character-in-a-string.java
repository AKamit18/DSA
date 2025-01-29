class Solution {
    public int firstUniqChar(String s) {

        if (s == null || s.length() == 0) {
            return -1;
        }

        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break; // No need to check further for this character
                }
            }
            if (isUnique) {
                return i;
            }
        }
        
        return -1;
        
    }
}