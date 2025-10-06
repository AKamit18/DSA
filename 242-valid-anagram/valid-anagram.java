class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for(int i=0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int counts: count) {
            if(counts != 0) {
                return false;
            }
        }
        return true;

        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();

        // Arrays.sort(sArray);
        // Arrays.sort(tArray);

        // // return Arrays.equals(sArray,tArray);

        // String sortedS = new String(sArray);
        // String sortedT = new String(tArray);

        // return sortedS.equals(sortedT);



        // int[] arr = new int[26];

        // for( int i =0; i<s.length();i++){
        //     arr[s.charAt(i) - 'a']++;
        // }

        // for( int i=0;i<t.length();i++) {
        //     arr[t.charAt(i) - 'a']--;

        //     if(arr[t.charAt(i) - 'a'] < 0) {
        //         return false;
        //     }
        // }

        // return true;

        // boolean flag = true;
        // for(int i=0;i<arr.length; i++) {
        //     if(arr[i] != 0) {
        //         flag = false;
        //     }
        // }

        // return flag;
        
        
    }
}