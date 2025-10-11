class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] result = {-1, -1};

        // Find first occurrence
        int first = findFirst(nums, target);
        if (first == -1) return result;  // Target not found

        // Find last occurrence
        int last = findLast(nums, target);

        result[0] = first;
        result[1] = last;

        return result;
    }

    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;  // keep searching left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;  // keep searching right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}