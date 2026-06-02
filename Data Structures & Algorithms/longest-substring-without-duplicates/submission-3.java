class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int res = 1;
        HashSet<Character> charSet = new HashSet<>();

        if (s.length() == 0) {
            return 0;
        }

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
