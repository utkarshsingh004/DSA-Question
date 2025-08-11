class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                a.add(nums1[i]);
                i++;
            } else {
                a.add(nums2[j]);
                j++;
            }
        }
        while (i < n) {
            a.add(nums1[i]);
            i++;
        }
        while (j < m) {
            a.add(nums2[j]);
            j++;
        }
        if(a.size()%2!=0){
            return a.get(a.size()/2);
        }
        return (double)(a.get(a.size()/2)+a.get(a.size()/2-1))/2;
    }
}