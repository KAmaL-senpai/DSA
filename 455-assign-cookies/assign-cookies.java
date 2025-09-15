class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;

        for (int i = 0; i < s.length && child < g.length; i++) {
            if (g[child] <= s[i])
                child++;
        }
        return child;
    }
}