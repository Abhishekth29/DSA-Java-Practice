class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;           // Pointer at the end of actual elements in nums1
        int p2 = n - 1;           // Pointer at the end of nums2
        int p = m + n - 1;        // Pointer at the end of total size of nums1

        // Merge from the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If anything left in nums2 (nums1 is already in place)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
