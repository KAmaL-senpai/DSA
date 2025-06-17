class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
         int[] target = new int[nums.length];
        int size = 0;

        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            int value = nums[i];
            for (int j = size; j > idx; j--) {
                target[j] = target[j - 1];
            }
            target[idx] = value;
            size++;
        }
        return target;
    }
}