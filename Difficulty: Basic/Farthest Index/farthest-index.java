// User function Template for Java

class Solution {
    public int findIndex(int[] arr, int x) {
        
        // code
        
        int n = arr.length;
        int index = -1;
        for(int i=0; i<n; i++) {
            if(arr[i] == x) {
                index = i+1;
            }
        }
        
        return index;
    }
}
