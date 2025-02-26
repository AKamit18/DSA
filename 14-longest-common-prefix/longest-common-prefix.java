class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Initialize prefix with the first string

        for (int i = 1; i < strs.length; i++) {
            // While the current prefix is not a prefix of the current string,
            // shorten the prefix.
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // No common prefix found
                }
            }
        }

        return prefix;
        
    }
}