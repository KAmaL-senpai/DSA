class Solution {
    public void reverseString(char[] s) {
        ans(s, 0, s.length-1);
    }
    static void ans(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }

        //swap
        char ch = s[start];
        s[start] = s[end];
        s[end] = ch;
        
        ans(s, start+1, end-1);
    }
}