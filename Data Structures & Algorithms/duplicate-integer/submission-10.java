class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setInt = new HashSet<>();
      
        for(int n : nums){
            if(setInt.contains(n)){
                return true;
            }else {
                setInt.add(n);
            }
        }
        return false;
    }
}