class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
         return check(a, b) || check(b, a);
    }static boolean check(String a, String b) {
        int i = 0,
                j = a.length() - 1;

        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        return isPalindrom(a, i, j) || isPalindrom(b, i, j);
    }

    static boolean isPalindrom(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
}