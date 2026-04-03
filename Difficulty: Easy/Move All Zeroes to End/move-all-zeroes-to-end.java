class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] srt = new int[n];
        
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0) srt[j++] = arr[i];
        }
        for(int i=0; i<n; i++){
            arr[i] = srt[i];
        }
    }
}