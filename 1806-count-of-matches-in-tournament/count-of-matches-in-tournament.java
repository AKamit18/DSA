class Solution {
    public int numberOfMatches(int n) {

        int sum = 0;

        while(n>1) {
            if(n%2 == 0) {
                //Even
                    sum = sum + (n/2);
                    n = n/2;
            }
            else {
                //Odd
                    sum = sum + (n/2);
                    n = ((n-1)/2)+1;
            }
        }

        return sum;  
    }
}