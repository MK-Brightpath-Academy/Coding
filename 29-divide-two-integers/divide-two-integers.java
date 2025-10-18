class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Find the sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive long
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            // Double using addition, not bit manipulation
            while (a >= (temp + temp)) {
                temp = temp + temp;          // temp = temp * 2
                multiple = multiple + multiple;  // multiple = multiple * 2
            }

            a = a - temp;
            result = result + (int) multiple;
        }

        return negative ? -result : result;
    }
}