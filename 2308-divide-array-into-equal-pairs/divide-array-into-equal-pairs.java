class Solution {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int count : counts.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
        
    }
}