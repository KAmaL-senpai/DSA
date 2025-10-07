class Solution {
    public String freqAlphabets(String s) {
         StringBuilder ans = new StringBuilder(s.length());

        for (int i = 0; i < s.length();) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // Convert to int the digit
                int num = Integer.parseInt(s.substring(i, i + 2));
                // get the corresponding char
                ans.append((char) ('a' + num - 1));
                i += 3;
            } else {
                //conver to int
                int num = s.charAt(i) - '0';
                //get the corresponding char
                ans.append((char) ('a' + num - 1));
                i++;
            }

        }
        return ans.toString();
    }
}