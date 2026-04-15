// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        StringBuilder str = new StringBuilder(s);
        int i=0, j=s.length()-1;
        while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i,s.charAt(j));
            str.setCharAt(j,temp);
            i++; j--;
        }
        String ans = str.toString();
        return ans;
    }
}