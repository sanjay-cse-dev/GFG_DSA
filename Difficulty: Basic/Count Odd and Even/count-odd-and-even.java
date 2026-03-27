class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even = 0;
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0) even += 1;
            else{
                odd += 1;
            }
        }
        int[] result = new int[2];
        result[1] = even;
        result[0] = odd;
        return result;
    }
}