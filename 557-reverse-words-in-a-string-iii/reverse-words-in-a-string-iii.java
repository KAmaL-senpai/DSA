class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            result.append(reverseString(strArr[i]));
            if (i < strArr.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
     static String reverseString(String str) {
              StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}