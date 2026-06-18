class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
         int[] merged = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                                .sorted()
                                .toArray();

        
        int n = merged.length;

        if (n % 2 == 1) {
            median = merged[n / 2];
        } else {
            median = (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
        return median;
    }  

}