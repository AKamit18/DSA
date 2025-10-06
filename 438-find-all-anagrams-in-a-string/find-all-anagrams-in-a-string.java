class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        if(s==null || p==null || s.length()< p.length()) return list;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        int windowSize = p.length();

        for( char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for( int i=0;i<windowSize;i++) { 
            sCount[s.charAt(i) - 'a']++;
        }

        for( int i =0;i<=s.length()-windowSize; i++) {

            if(Arrays.equals(pCount,sCount)) {
                list.add(i);
            }

            if(i+windowSize < s.length()) {
                sCount[s.charAt(i) - 'a'] --;
                sCount[s.charAt(i+windowSize) - 'a']++;
            }
        }

        return list;
        
    }
}