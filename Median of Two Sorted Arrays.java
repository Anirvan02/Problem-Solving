class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length; 
        int[] merge = new int[n];

        for(int i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++) {
            merge[nums1.length + i] = nums2[i];
        }
        Arrays.sort(merge);

        int len = merge.length;
        if(len % 2 == 0) {
            double median = ((double)merge[len / 2] + (double)merge[len / 2 - 1]) / 2.0;
            return median;
        }
        else {
            double median = (double)merge[len/ 2];
            return median;
        }
    }
}
