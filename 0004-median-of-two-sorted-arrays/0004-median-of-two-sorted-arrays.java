class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        
        // Ensure a is the smaller array
        if (n1 > n2) {
            return findMedianSortedArrays(b, a);
        }
        
        int n = n1 + n2;
        int i = 0;
        int j = n1; // we search only in a
        
        while (i <= j) {
            int mid = i + (j - i) / 2;  // cut in a
            int cutB = (n + 1) / 2 - mid; // corresponding cut in b
            
            int a1 = (mid > 0) ? a[mid - 1] : Integer.MIN_VALUE; // left a
            int a2 = (mid < n1) ? a[mid] : Integer.MAX_VALUE;    // right a
            int b1 = (cutB > 0) ? b[cutB - 1] : Integer.MIN_VALUE; // left b
            int b2 = (cutB < n2) ? b[cutB] : Integer.MAX_VALUE;    // right b
            
            if (a1 <= b2 && b1 <= a2) {
                if (n % 2 == 1) {
                    return Math.max(a1, b1);
                } else {
                    return (Math.max(a1, b1) + Math.min(a2, b2)) / 2.0;
                }
            } else if (a1 > b2) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        
        return 0;
    }
}
