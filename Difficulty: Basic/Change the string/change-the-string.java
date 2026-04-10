
class Solution {
    String modify(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        char firstChar = s.charAt(0);
        
        if (firstChar >= 97 && firstChar <= 122) {
            return s.toLowerCase();
        }
        else return s.toUpperCase();
    }
}