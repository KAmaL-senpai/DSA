class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
         if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        int i = 0;
        int j = str1.length - 1;
        int k = 0;
        int l = str2.length - 1;
        //Match the front
        while (k <= l && i <= j && str2[k].equals(str1[i])) {
            k++;
            i++;
        }
        //Match the back
        while (k <= l && i <= j && str2[l].equals(str1[j])) {
            j--;
            l--;
        }
        return l < k;
    }
}