class Solution {
    public int[] sortArrayByParity(int[] nums) {
         List<Integer> list = new ArrayList<>(nums.length);

        for (int num : nums) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}