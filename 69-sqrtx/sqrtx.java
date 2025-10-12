class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // 0 or 1 are easy cases

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid; // use long to avoid overflow

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid; // store last valid mid
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}