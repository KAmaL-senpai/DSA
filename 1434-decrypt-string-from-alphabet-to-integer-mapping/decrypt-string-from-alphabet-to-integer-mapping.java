class Solution {
    public String freqAlphabets(String s) {
         StringBuilder ans = new StringBuilder();
        Map<String, Character> map1 = new HashMap<>();
        map1.put("10#", 'j');
        map1.put("11#", 'k');
        map1.put("12#", 'l');
        map1.put("13#", 'm');
        map1.put("14#", 'n');
        map1.put("15#", 'o');
        map1.put("16#", 'p');
        map1.put("17#", 'q');
        map1.put("18#", 'r');
        map1.put("19#", 's');
        map1.put("20#", 't');
        map1.put("21#", 'u');
        map1.put("22#", 'v');
        map1.put("23#", 'w');
        map1.put("24#", 'x');
        map1.put("25#", 'y');
        map1.put("26#", 'z');
        Map<Character, Character> map2 = new HashMap<>();
        map2.put('1', 'a');
        map2.put('2', 'b');
        map2.put('3', 'c');
        map2.put('4', 'd');
        map2.put('5', 'e');
        map2.put('6', 'f');
        map2.put('7', 'g');
        map2.put('8', 'h');
        map2.put('9', 'i');

        for (int i = 0; i < s.length();) {
            if (i + 2 < s.length() && map1.containsKey(s.substring(i, i + 3))) {
                ans.append(map1.get(s.substring(i, i + 3)));
                i += 3;
            } else if (map2.containsKey(s.charAt(i))) {
                ans.append(map2.get(s.charAt(i)));
                i++;
            }

        }
        return ans.toString();
    }
}