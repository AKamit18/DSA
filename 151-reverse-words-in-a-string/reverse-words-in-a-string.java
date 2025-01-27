class Solution {
    public String reverseWords(String s) {

        // Str4ing se array me kardo and then space pe filter kro ...

        // 
        //List<String> words = new ArrayList<>();
        s = s.trim();
        String[] words = s.split("\\s+");
        //return words;

        String resstring = "";
        for(int i = words.length-1; i >=0; i--) {
            resstring =resstring + words[i]+" ";
        }


        return resstring.trim();

        //StringBuilder words = new StringBuilder(s);
        //words = words.reverse();
        //return words.toString();


        //words = words.reverse();

    }
}