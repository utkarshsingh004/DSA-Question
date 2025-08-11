class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, count = 0;
        int total = n + m;
        int k1 = (total % 2 == 0) ? total / 2 - 1 : total / 2; 
        int k2 = total / 2;
        
        double e1 = 0, e2 = 0;

        while (i < n && j < m) {
            int val;
            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }

            if (count == k1) e1 = val;
            if (count == k2) e2 = val;
            count++;
        }

        while (i < n) {
            int val = nums1[i++];
            if (count == k1) e1 = val;
            if (count == k2) e2 = val;
            count++;
        }

        while (j < m) {
            int val = nums2[j++];
            if (count == k1) e1 = val;
            if (count == k2) e2 = val;
            count++;
        }

        return (total % 2 != 0) ? e2 : (e1 + e2) / 2.0;
    }
}
