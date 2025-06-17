class Solution {
    public boolean checkIfPangram(String sentence) {
         boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }

        for (boolean val : seen) {
            if (!val)
                return false;
        }
        return true;

    }
}