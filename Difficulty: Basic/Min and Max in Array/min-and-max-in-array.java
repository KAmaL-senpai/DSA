class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        return getMinMax(arr, 0, arr.length - 1);
    }
    static ArrayList<Integer> getMinMax(int[] arr, int start, int end) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<>();

        if (start == end) {
            ans.add(arr[start]);
            ans.add(arr[end]);
            return ans;
        }
        int mid = start + (end - start) / 2;

        ArrayList<Integer> left = getMinMax(arr, start, mid);
        ArrayList<Integer> right = getMinMax(arr, mid + 1, end);

        int overallMin = Math.min(left.get(0), right.get(0));
        int overallMax = Math.max(left.get(1), right.get(1));

        ans.add(overallMin);
        ans.add(overallMax);
        return ans;

    }
}
