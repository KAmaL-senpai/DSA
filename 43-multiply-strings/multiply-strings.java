class Solution {
    public String multiply(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0"))
            return "0";

        // intialize arr to hold the result of multiplication
        int[] resultArr = new int[num1.length() + num2.length()];

        // Reversing the both the string
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                // multiplication
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int mul = digit1 * digit2;

                // find positions in the result array where to add the result;
                int posLast = i + j + 1;
                int posFirst = i + j;

                // add the multiplication result to the current position and handle carry
                int sum = mul + resultArr[posLast];

                resultArr[posLast] = sum % 10; // set the current position to the remainder;
                resultArr[posFirst] += sum / 10; // add the carry to the next higher position

            }
        }

        //Conversion to string for the resultArr;

        StringBuilder ans = new StringBuilder();
        for (int num : resultArr) {
            //skip leading zeroes
            if (!(ans.length() == 0 && num == 0)) {
                ans.append(num);
            }
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}