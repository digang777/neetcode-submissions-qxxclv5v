class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>> resultSet = new HashSet<>();

        Arrays.sort(nums);

        int i = 0;

        while(nums[i] < 0) {

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                if (nums[i] + nums[l] + nums[r] == 0) {
                    resultSet.add(Arrays.asList(nums[i], nums[l], nums[r]));
                }
                if (nums[l] + nums[r] < Math.abs(nums[i])) {
                    l++;
                } else {
                    r--;
                }
            }
            i++;
        }
        if(nums[0] == 0 && nums[0] == nums[nums.length -1]) {
            resultSet.add(Arrays.asList(0,0,0));
        }
        return new ArrayList<>(resultSet);
    }
}
