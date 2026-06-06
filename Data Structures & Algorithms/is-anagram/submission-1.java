class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();

        char[] charArray = s.toCharArray();

        for (char symbol : charArray) {
            map1.put(symbol, map1.getOrDefault(symbol, 0) + 1);
        }

        int i = 0;
        while (i < t.length()) {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) - 1);
            i++;
        }

        long countSymbolNotEqualZero = map1.entrySet().stream()
        .filter(entry -> entry.getValue() != 0)
        .count();
        return countSymbolNotEqualZero == 0;
    }
}
