class Solution {
    public int calculate(String s) {
        Stack<Integer> nums = new Stack<>();
        int number = 0;
        char operator = '+';

          for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Build the current number
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            // When we reach an operator or end of string, process the last number
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (operator == '+') {
                    nums.push(number);
                } else if (operator == '-') {
                    nums.push(-number);
                } else if (operator == '*') {
                    nums.push(nums.pop() * number);
                } else if (operator == '/') {
                    nums.push(nums.pop() / number);
                }
                operator = ch;
                number = 0;
            }
        }
        int sum = 0;
        while (!nums.isEmpty()) {
            sum += nums.pop();
        }
        return sum;
    }
}