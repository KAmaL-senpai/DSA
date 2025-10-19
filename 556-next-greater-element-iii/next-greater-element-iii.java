class Solution {
    public int nextGreaterElement(int n) {
         int ind = -1;
        char[] digits = String.valueOf(n).toCharArray();

        // Find the first decreasing number from right to left;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind < 0)
            return -1; //Aready highest permutation


        // Find the next greater digit to the right of ind;
        for (int j = digits.length - 1; j > ind; j--) {
            //swap if found
            if (digits[j] > digits[ind]) {
                char temp = digits[ind];
                digits[ind] = digits[j];
                digits[j] = temp;
                break;
            }
        }

        //reverse the suffix after ind;
        reverse(digits, ind + 1, digits.length - 1);

        long res = Long.parseLong(new String(digits));
        return (res <= Integer.MAX_VALUE) ? (int) res : -1;
    }
    static void reverse(char[] arr, int left, int right) {
        while (left<right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}