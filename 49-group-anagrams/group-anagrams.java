class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyMap = new HashMap<>();
        for (String str : strs) {
            // getting frequency of each string
            String frequencyString = getFrequency(str);

            if (frequencyMap.containsKey(frequencyString)) {
                frequencyMap.get(frequencyString).add(str);
            } else {
                // create a new key and list
                List<String> list = new ArrayList<>();
                list.add(str);
                frequencyMap.put(frequencyString, list);
            }
        }
        return new ArrayList<>(frequencyMap.values());
    }
    static String getFrequency(String str) {
        // char array for 26 letters to count;
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Creating frequency;
        StringBuilder freqString = new StringBuilder("");
        char c = 'a';
        for (int i : freq) {
            freqString.append(c);
            freqString.append(i);
            c++;
        }
        return freqString.toString();
    }
}