class Solution {
    public int largestAltitude(int[] gain) {
         int alt = 0;
        int top = Integer.MIN_VALUE;
        for (int i = 0; i < gain.length; i++) {
            alt += gain[i];
            if (top < alt) {
                top = alt;
            }
        }
        if (top < 1) {
            return 0;
        }
        return top;
    }
}