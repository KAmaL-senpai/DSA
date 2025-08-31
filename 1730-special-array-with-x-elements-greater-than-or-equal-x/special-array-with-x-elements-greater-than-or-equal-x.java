class Solution {
    public int specialArray(int[] nums) {
        int left=0;
        int right=nums.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count =countGreaterOrEqual(nums, mid); if (count > mid) {
                left = mid + 1;
            } else if (count < mid) {
                right = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
    public int countGreaterOrEqual(int[] nums, int x) {
        int count = 0;
        for (int num : nums)
            if (num >= x) {
                count++;
            }
        return count;
    }
}