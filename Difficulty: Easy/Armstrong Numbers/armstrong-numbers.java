// User function Template for Java
class Solution {
    static boolean armstrongNumber(int num) {
        int n = num;
        int count = 0; 
        int sum = 0;
        while(n!=0){
            count = n%10; 
            sum = sum+(count*count*count);
            n=n/10;
        }
        if(num==sum) return true;
        else return false;
    }
}