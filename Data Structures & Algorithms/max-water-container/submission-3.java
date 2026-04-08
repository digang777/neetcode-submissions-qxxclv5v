class Solution {
    public int maxArea(int[] heights) {
    int l = 0;
        int r = heights.length - 1;

        int maxSquare = 0;

        while (l < r) {
            int s = Math.min(heights[l], heights[r]) * (r - l);
            if (maxSquare < s) {
                maxSquare = s;
            }
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxSquare;
    }
}
