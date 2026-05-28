class Solution {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Если дополнение уже есть в карте — пара найдена
            if (map.containsKey(complement)) {
                int j = map.get(complement);
                // Возвращаем с меньшим индексом первым
                return new int[] { Math.min(i, j), Math.max(i, j) };
            }
            
            // Сохраняем текущее число и его индекс
            map.put(nums[i], i);
        }
    return new int[]{};
    }
}
