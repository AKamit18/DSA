class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();


        for(String str : strs) {
            int[] count = new int[26];
            for( char c: str.toCharArray()){
                count[c-'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int num: count) {
                key.append(num).append('#');
            }

            map.computeIfAbsent(key.toString(), k-> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());


        // for( String str : strs) 
        // {
        //     char[] chars = str.toCharArray();
        //     Arrays.sort(chars);
        //     String key = new String(chars);
        //     map.computeIfAbsent(key, k -> new ArrayList<>()).add(str); 
        //     //List<String> list = map.computeIfAbsent(key, k -> new ArrayList<>());
        //     //list.add(str);

        //     // if (!map.containsKey(key)) {
        //     //     map.put(key, new ArrayList<>());   // create new list if key not present
        //     // }
        //     // map.get(key).add(str);  // add current string to that list


        // }

        // return new ArrayList<>(map.values());
        
    }
}