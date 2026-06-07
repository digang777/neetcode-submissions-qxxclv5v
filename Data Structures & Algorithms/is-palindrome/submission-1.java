class Solution {
    public boolean isPalindrome(String s) {

     String strWithoutSpaces = s.replaceAll("[\\s\\p{Punct}]", "");

      char[] charArray = strWithoutSpaces.toLowerCase().toCharArray();

      int l = 0;
      int r = charArray.length - 1;

      while(l<r){
        if(charArray[l] == charArray[r]){
            l++;
            r--;
        }else{
            return false;
        }
      }

      return true;

    }
}
