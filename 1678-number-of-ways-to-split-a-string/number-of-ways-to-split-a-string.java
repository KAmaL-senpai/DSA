class Solution {
    public int numWays(String s) {
        long oneCount = 0;
        long n = s.length();
        long mod = 1_000_000_007;
        for (char ch : s.toCharArray()) {
            oneCount += ch - '0';
        }
        if (oneCount == 0)
            return (int) ((((n - 1) * (n - 2)) / 2) % mod);

        if (oneCount % 3 != 0)
            return 0;

        long oneThird = oneCount / 3;
        long count = 0;
        long ways1 = 0;
        long ways2 = 0;
        for (char ch : s.toCharArray()) {
            count += ch - '0';
            if (count == oneThird)
                ways1++;
            else if (count == 2 * oneThird)
                ways2++;
        }

        return (int) ((ways1 * ways2) % mod);
    }
}