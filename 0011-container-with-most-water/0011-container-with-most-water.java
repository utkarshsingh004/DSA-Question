class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int width = j - i;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            // Move the shorter line inward to try and find a taller one
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}
