   /**
     * This method solves the classic "House Robber" problem using dynamic
     * programming.
     *
     * Problem:
     * Given an array where each element represents the amount of money in a house,
     * you cannot rob two adjacent houses (due to security systems).
     * The goal is to determine the maximum amount of money you can rob without
     * triggering the alarm.
     *
     * Approach:
     * - If there's only one house, return the amount in that house.
     * - Create a `loot` array to track the maximum amount that can be robbed up to
     * each house.
     * - Initialize:
     * - loot[0] = money in the first house
     * - loot[1] = max(money in first, money in second house)
     * - For each house from index 2 onward:
     * - Either rob this house (and add its value to loot[i - 2])
     * - Or skip it and take the value from loot[i - 1]
     * - Take the maximum of these two options
     *
     * This ensures that at each step, we make the best decision while avoiding
     * robbing adjacent houses.
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
class Solution {
    public int rob(int[] nums) {
         if (nums.length < 2) {
            return nums[0];
        }
        int[] loot = new int[nums.length];
        loot[0] = nums[0];
        loot[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            loot[i] = Math.max(loot[i - 2] + nums[i], loot[i-1]);
        }
        return loot[nums.length - 1];
    }
}