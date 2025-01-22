class Solution {
    public int singleNumber(int[] nums) {

         // Use a HashMap to count occurrences of each number
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the number that appears exactly once
        for (int key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                return key;
            }
        }
        
        // Default return (should not reach here if input is valid)
        return -1;
        
    }
}