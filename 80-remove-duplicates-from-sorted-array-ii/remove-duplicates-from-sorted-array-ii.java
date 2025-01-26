class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        List<Integer> temp = new ArrayList<>();
        int count = 1; // Count occurrences of the current element.

        temp.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // Reset count for a new number.
            }

            if (count <= 2) {
                temp.add(nums[i]);
            }
        }

        // Copy back elements from the list to the original array.
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        return temp.size();
        
    }
}