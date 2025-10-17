class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        while (str.length() < b.length()) {
            str.append(a);
            count++;
        }
        // Check after enough length
        if (str.toString().contains(b))
            return count;
        str.append(a);
        count++;
        // Try one more time (in case b starts in one repetition and ends in the next)
        if (str.toString().contains(b))
            return count;

        return -1;
    }
}