class Solution {
    public int removeDuplicates(int[] nums) {
          if (nums.length == 0) return 0;

        int i = 0; // points to the last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;               // move pointer for unique
                nums[i] = nums[j]; // overwrite duplicate
            }
        }

        return i + 1; 
    }
}