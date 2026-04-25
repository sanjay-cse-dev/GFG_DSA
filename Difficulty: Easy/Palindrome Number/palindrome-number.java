class Solution {
    public boolean isPalindrome(int n) {
        int num = n;
        if(n<0) num = -(-n);
        int rev = 0;
        while(num!=0){
            rev = rev*10+(num%10);
            num=num/10;
        }
        if(n==rev) return true;
        else return false;
    }
}