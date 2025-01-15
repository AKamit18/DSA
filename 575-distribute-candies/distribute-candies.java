class Solution {
    public int distributeCandies(int[] candyType) {

        int n = candyType.length;
        boolean isUnique;
        int isUniqueCounter = 0;

        for(int i=0; i<n; i++) {
            isUnique = true;
            for(int j=0; j<i; j++) {

                if(candyType[i] == candyType[j]) {
                    isUnique = false;
                    break;
                }

            }
            if(isUnique) {
                isUniqueCounter++;
            }
        }
        int maxType = n/2;

        return Math.min(isUniqueCounter, maxType);
        
    }
}