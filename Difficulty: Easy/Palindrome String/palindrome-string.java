class Solution {
    boolean isPalindrome(String s) {
        return checkPalindrome(s,0,s.length()-1);
    }
    boolean checkPalindrome(String str, int low, int high){
        if(low>high) return true;
        
        if(str.charAt(low) != str.charAt(high)) return false;
        
        return checkPalindrome(str,low+1,high-1);
    }
}