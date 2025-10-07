class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         return concatString(word1).equals(concatString(word2));
    }
    static String concatString(String[] word) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            str.append(word[i]);
        }
        return str.toString();
    }
}