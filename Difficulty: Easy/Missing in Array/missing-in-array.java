class Solution {
    int missingNum(int arr[]) {
        long n = arr.length + 1; 
        long sum = n*(n+1)/2;
        
        long ArraySum = 0;
        for(int i=0; i<arr.length; i++){
            ArraySum += arr[i];
        }
        
        return (int)(sum - ArraySum);
        
    }
}