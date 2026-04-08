class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num,0)+1);

        }

        long countMoreThenOne = map.entrySet().stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getValue() > 1)
                .count();

        return countMoreThenOne != 0;
        
    }
}