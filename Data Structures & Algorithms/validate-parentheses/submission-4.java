class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> mapCloseToOpen = new HashMap<>();

        mapCloseToOpen.put('}', '{');
        mapCloseToOpen.put(']', '[');
        mapCloseToOpen.put(')', '(');

        for (char c : s.toCharArray()) {
            if (mapCloseToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == mapCloseToOpen.get(c)){
                  stack.pop();
                } else {
                     return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
