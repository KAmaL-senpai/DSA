class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length;) {
            int correctInd = nums[i] - 1;
            if (nums[i] != nums[correctInd]) {
                int temp = nums[i];
                nums[i] = nums[correctInd];
                nums[correctInd] = temp;
            } else {
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }
        return list;

    }
}