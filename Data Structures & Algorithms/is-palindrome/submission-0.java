class Solution {
    public boolean isPalindrome(String s) {
        String strWithoutSpaces = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();

       int startPoint = 0;

       int k = strWithoutSpaces.length()-1;

        char[] charArray = strWithoutSpaces.toCharArray();

       while (startPoint < k) {

           if (charArray[startPoint] != charArray[k]) {
               return false;
           }
           startPoint++;
           k--;
       }

       return true;
    }
}
