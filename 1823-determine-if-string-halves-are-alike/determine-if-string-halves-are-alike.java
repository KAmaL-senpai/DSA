class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        int aCount = 0, bCount = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (isVowel(str.charAt(i)))
                aCount++;
            if (isVowel(str.charAt(s.length() - 1 - i)))
                bCount++;
        }
        return aCount == bCount;
    }
     static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}