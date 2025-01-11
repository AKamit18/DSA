class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int orgNum = x;
        int revNum = 0;

        while(x !=0 ){

            int digit = x%10; //Extract last digit
            revNum = revNum * 10 + digit; //Append the digit to revNum
            x = x/10; //Remove last digit

        }
        return orgNum == revNum;
    }
}