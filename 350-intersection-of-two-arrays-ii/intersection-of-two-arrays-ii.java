class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> listresult = new ArrayList<>();
        for (int num : nums2)
            if (map.getOrDefault(num, 0) > 0) {
                listresult.add(num);
                map.put(num, map.get(num) - 1);
            }

        int[] res = new int[listresult.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = listresult.get(i);
        return res;
    }
}