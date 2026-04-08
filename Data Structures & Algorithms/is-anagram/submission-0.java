class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        
        char[] charArray = s.toCharArray();

        for(char symbol : charArray) {

            map.put(symbol, map.getOrDefault(symbol, 0) + 1);

        }

        char[] charArrayT = t.toCharArray();

        for(char symbol : charArrayT) {

            map.put(symbol, map.getOrDefault(symbol, 0) - 1);

        }

       long countSymbolNotEqualZero = map.entrySet().stream()
        .filter(entry -> entry.getValue() != 0)
        .count();
        return countSymbolNotEqualZero == 0;

    }
}
