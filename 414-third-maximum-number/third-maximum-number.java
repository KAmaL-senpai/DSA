class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                continue;
            } else {
                list.add(num);
            }
        }
        int n = list.size();
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(n - i - 1);
            list.set(n - i - 1, list.get(i));
            list.set(i, temp);
        }

        if (list.size() >= 3) {
            return list.get(2);
        }

        return list.get(0);
    }
}