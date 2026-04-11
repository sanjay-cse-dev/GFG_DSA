class Solution {
    public static int sumSubstrings(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int k = i; k < s.length(); k++) {
               String str = s.substring(i,k+1);
               int con = Integer.parseInt(str);
               sum = sum + con;
            }
        }
        return sum;
    }
}