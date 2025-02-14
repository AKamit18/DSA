class Solution {
    public int largestInteger(int num) {

        // Convert the number to a char array
        char[] digits = Integer.toString(num).toCharArray();
        
        // Separate even and odd digits into two lists
        List<Integer> evenDigits = new ArrayList<>();
        List<Integer> oddDigits = new ArrayList<>();
        
        for (char digit : digits) {
            int digitValue = digit - '0';
            if (digitValue % 2 == 0) {
                evenDigits.add(digitValue); // Even digits
            } else {
                oddDigits.add(digitValue); // Odd digits
            }
        }
        
        // Sort even and odd digits in descending order
        Collections.sort(evenDigits, Collections.reverseOrder());
        Collections.sort(oddDigits, Collections.reverseOrder());
        
        // Rebuild the number with sorted digits
        StringBuilder result = new StringBuilder();
        for (char digit : digits) {
            int digitValue = digit - '0';
            if (digitValue % 2 == 0) {
                result.append(evenDigits.remove(0)); // Take from even digits
            } else {
                result.append(oddDigits.remove(0)); // Take from odd digits
            }
        }
        
        // Convert the result back to an integer
        return Integer.parseInt(result.toString());
        
    }
}
