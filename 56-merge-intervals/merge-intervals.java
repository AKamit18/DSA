class Solution {
    public int[][] merge(int[][] intervals) {
       if (intervals.length == 0) return new int[0][0];

    // Step 1: Sort intervals based on the start time.
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> merged = new ArrayList<>();

    // Step 2: Iterate through the intervals and merge if needed
    for (int[] interval : intervals) {
        // If merged list is empty or the current interval does not overlap with the last merged one
        if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
            merged.add(interval);
        } else {
            // If they overlap, merge the intervals
            merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
        }
    }

    // Step 3: Convert the List back to a 2D array and return
    return merged.toArray(new int[merged.size()][]); 
    }
}