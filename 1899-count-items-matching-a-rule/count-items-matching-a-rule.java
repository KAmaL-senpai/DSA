class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int keyIndex = 0;
        if (ruleKey.equals("color")) {
            keyIndex = 1;
        } else if (ruleKey.equals("name")) {
            keyIndex = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(keyIndex).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}