//Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true

public class Specialcoding1 {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int size = s.length();
        String lcs = s.toLowerCase();
        int left = 0;
        int right = size - 1;
        while(right >= left) {
            if(lcs.charAt(right) == lcs.charAt(left)) {
                right--;
                left++;
            } else if(!Character.isLetter(lcs.charAt(right))) {
                right--;
            } else if(!Character.isLetter(lcs.charAt(left))) {
                left++;
            } else {
                return false;
            }
        }
        
        return true;
    }

}