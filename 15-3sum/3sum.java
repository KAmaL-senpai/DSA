class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                if (hashset.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                hashset.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}