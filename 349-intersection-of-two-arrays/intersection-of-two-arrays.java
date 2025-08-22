class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
        for (int num : nums1)
            set1.add(num);

        Set<Integer> restSet = new HashSet<>();
        for (int num : nums2)
            if (set1.contains(num))
                restSet.add(num);

        int[] res = new int[restSet.size()];
        int i = 0;
        for (int num : restSet)
            res[i++] = num;

        return res;
    }
}