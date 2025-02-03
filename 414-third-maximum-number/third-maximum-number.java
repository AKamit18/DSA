class Solution {
    public int thirdMax(int[] nums) {
        
        // Using a TreeSet to maintain distinct elements in sorted order (descending)
        TreeSet<Integer> distinctNums = new TreeSet<>(Collections.reverseOrder());

        // Adding all numbers to the TreeSet to remove duplicates and sort in descending order
        for (int num : nums) {
            distinctNums.add(num);
        }

        // If there are less than 3 distinct numbers, return the maximum
        if (distinctNums.size() < 3) {
            return distinctNums.first();
        }

        // Removing the first and second maximum to get the third maximum
        distinctNums.pollFirst();  // Remove the largest
        distinctNums.pollFirst();  // Remove the second largest

        return distinctNums.first(); // The third largest
    }
}