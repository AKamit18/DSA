class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Step 1: Create a new array with combined size
        int[] merged = new int[m + n];

        // Step 2: Copy elements from nums1 and nums2 into merged
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }

        // Step 3: Sort the merged array
        Arrays.sort(merged);

        // Step 4: Copy the sorted array back into nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
        }

        
    }
}
