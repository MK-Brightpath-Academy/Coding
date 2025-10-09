class Solution {
    public int strStr(String haystack, String needle) {
         int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0; // Empty needle
        if (m > n) return -1; // Impossible case

        for (int i = 0; i <= n - m; i++) {
            // Check substring from i to i + m
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}