class Solution {
    public int removeElement(int[] nums, int val) {
         int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // Swap with last unprocessed element
                n--; // Decrease array size
            } else {
                i++; // Move to next
            }
        }

        return n;
    }
}