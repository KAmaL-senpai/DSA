class Solution {
    public int subtractProductAndSum(int n) {
        String a = Integer.toString(n);
        int sum = 0;
        int pro = 1;
        for (int i = 0; i < a.length(); i++) {
            int digits=a.charAt(i) - '0';
            sum += digits;
            pro *= digits;
        }
        return pro - sum;
    }
}