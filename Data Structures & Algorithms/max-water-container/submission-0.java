class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxWater = Integer.MIN_VALUE;
        
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (heights[left] < heights[right]) {
                int water = heights[left] * (right - left);
                if (water > maxWater) maxWater = water;
                left++;
            }
            else if (heights[left] > heights[right]) {
                int water = heights[right] * (right - left);
                if (water > maxWater) maxWater = water;
                right--;
            }
        }
        return maxWater;
    }
}
