class Solution {
    public int rangeBitwiseAnd(int left, int right) {

                int shiftCount = 0;
        while (left < right) {
            left >>= 1;  // Right shift left by 1
            right >>= 1; // Right shift right by 1
            shiftCount++;  // Count the number of shifts
        }
        
        // Shift left back to the left to restore the common bits
        return left << shiftCount;
        
    }
}
