class Solution {
    public boolean halvesAreAlike(String s) {
         String str = s.toLowerCase();

        String vowels = "aeiou";
        int aCount = 0, bCount = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                aCount++;
            }
            if (vowels.contains(String.valueOf(str.charAt(s.length() - 1 - i)))) {
                bCount++;
            }
        }
        return aCount == bCount;
    }
}