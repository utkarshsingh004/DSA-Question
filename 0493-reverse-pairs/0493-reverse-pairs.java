class Solution {
    private int merge(int []nums, int i, int mid, int j){
        int count = 0;
        int l = i, r = mid + 1;

        // Count reverse pairs first
        while (l <= mid && r <= j) {
            if ((long)nums[l] > 2L * nums[r]) {
                count += (mid - l + 1);
                r++;
            } else {
                l++;
            }
        }

        // Merge step
        ArrayList<Integer> a = new ArrayList<>();
        l = i;
        r = mid + 1;
        while (l <= mid && r <= j) {
            if (nums[l] <= nums[r]) {
                a.add(nums[l++]);
            } else {
                a.add(nums[r++]);
            }
        }
        while (l <= mid) a.add(nums[l++]);
        while (r <= j) a.add(nums[r++]);

        for (int k = 0; k < a.size(); k++) {
            nums[i + k] = a.get(k);
        }
        return count;
    }

    private int mergeSort(int[] nums, int i, int j){
        if (i >= j) return 0;
        int mid = i + (j - i) / 2;
        int count = 0;
        count += mergeSort(nums, i, mid);
        count += mergeSort(nums, mid + 1, j);
        count += merge(nums, i, mid, j);
        return count;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
