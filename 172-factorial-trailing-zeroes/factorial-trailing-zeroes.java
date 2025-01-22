class Solution {
    public int trailingZeroes(int n) {

        int count = 0;
        // Keep dividing n by powers of 5 and add the quotients
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
        
    }
}