class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        int idx = 0;

        for(int n : nums){
            if(hashMap.containsKey(target - n)){
                return new int[]{Math.min(hashMap.get(target - n), idx), 
                             Math.max(hashMap.get(target - n), idx)};
            }else {
                hashMap.put(n, idx);
            }
            idx++;
        }
        return new int[0];
    }
}
