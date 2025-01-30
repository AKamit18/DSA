class Solution {
    public String addStrings(String num1, String num2) {

        // int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        // return String.valueOf(sum);

        StringBuilder result = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        // Traverse both numbers from the last digit to the first
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;  // Carry for the next iteration
            result.append(sum % 10);  // Append the last digit of sum

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}