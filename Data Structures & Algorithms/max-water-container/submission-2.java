class Solution {
    public int maxArea(int[] heights) {
        
    int l=0;
        int r = heights.length - 1;

        int maxSquare = 0;
        if (heights.length < 2) {
            return 0;
        }

        while(l<r) {
            int s = Math.min(heights[l], heights[r]) * (r - l);
            if (maxSquare < s) {
                maxSquare = s;
            }
            if (heights[l] < heights[r]){
                l++;
            }else if(heights[l] > heights[r]) {
                r--;
            } else if (heights[l+1] > heights[r-1]){
                r--;
            } else {
                l++;
            }
        }

        return maxSquare;
    }
}
