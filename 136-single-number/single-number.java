class Solution {
    public int singleNumber(int[] nums) {
       Set<Integer> set = new HashSet<>();
    int sum = 0;
    for (int num : nums) {
        if (set.contains(num)) sum -= num;
        else {
            sum += num;
            set.add(num);
        }
    }
    return sum;
    }
}