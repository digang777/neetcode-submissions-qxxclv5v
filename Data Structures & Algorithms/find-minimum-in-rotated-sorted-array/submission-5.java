class Solution {
    public int findMin(int[] nums) {
        int lMin = 0;
        int rMin = 0;

        int l = 0;
        int r = 1;

        if (nums.length == 1) {
            return nums[0];
        }

        while (nums[l] < nums[r] && r < nums.length - 1) {
            r++;
        }

        if (r <= nums.length - 1) {
            rMin = nums[r];
        } else {
            rMin = nums[l];
        }
        lMin = nums[l];

        return Math.min(lMin, rMin);
    }
}
