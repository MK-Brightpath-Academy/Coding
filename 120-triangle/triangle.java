class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
         int n = triangle.size();
        int[] dp = new int[n];

        // Copy the last row as starting point
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // Bottom-up calculation
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }

        // dp[0] will hold the final answer
        return dp[0];
        
    }
}