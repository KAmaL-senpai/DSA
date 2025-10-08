class Solution {
    public String reverseWords(String s) {
         String[] strArr = s.split(" ");
        for (int i = 0; i < strArr.length ; i++) {
            String ss = reverseString(strArr[i]);
            strArr[i] = ss;
        }

        return String.join(" ", strArr);
    }
     static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}