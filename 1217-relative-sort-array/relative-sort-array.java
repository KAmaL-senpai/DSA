class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         // Step 1: Frequency map of arr1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int key = arr1[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        List<Integer> ansList = new ArrayList<>();

        // Step 2: Add elements in arr2 order
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                for (int j = 0; j < map.get(arr2[i]); j++) {
                    ansList.add(arr2[i]);
                }
                map.remove(arr2[i]); // Remove used keys
            }
        }

        // Step 3: Add remaining elements (not in arr2), sorted
        List<Integer> remainingKeys = new ArrayList<>(map.keySet());
        Collections.sort(remainingKeys);

        for (int key : remainingKeys) {
            int count = map.get(key);
            for (int j = 0; j < count; j++) {
                ansList.add(key);
            }
        }

        // Step 4: Convert List to int[]
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}