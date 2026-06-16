class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // found the pair
            }

            map.put(nums[i], i); // store current value and its index
        }

        return new int[]{-1, -1}; // not found (edge case)
    
    }
}