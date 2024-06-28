class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];

        int k = 0;
        for (int i = 0; i < m; i++) {
            arr[k] = nums1[i];
            k++;
        }

        for (int i = 0; i < n; i++) {
            arr[k] = nums2[i];
            k++;
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
        Arrays.sort(nums1);
    }
}
