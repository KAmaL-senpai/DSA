class Solution {
    public String sortSentence(String s) {
         StringBuilder ans = new StringBuilder();
        String[] strArr = s.split(" ");

        Arrays.sort(strArr, (a, b) -> a.charAt(a.length() - 1) - b.charAt(b.length() - 1));
        
        for (String str : strArr) {
                ans.append(str.substring(0, str.length() - 1)).append(" ");
        }

        return ans.toString().trim();
    }
}