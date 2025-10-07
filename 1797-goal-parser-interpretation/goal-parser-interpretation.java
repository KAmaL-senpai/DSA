class Solution {
    public String interpret(String command) {
         StringBuilder ans = new StringBuilder();
        char[] charArr = command.toCharArray();
        for (int i = 0; i < charArr.length;) {
            if (charArr[i] == 'G') {
                ans.append('G');
                i++;
            } else if ( i + 1 < charArr.length &&charArr[i] == '(' && charArr[i + 1] == ')') {
                ans.append('o');
                i += 2;
            } else if (i + 3 < charArr.length &&charArr[i] == '(' && charArr[i + 1] == 'a') {
                ans.append("al");
                i += 4;
            }
        }
        return ans.toString();

    }
}