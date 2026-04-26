class Solution {
    public int missingNumber(int[] arr) {
        int k=1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]==k){
                    k++;
                    break;
                }
            }
            if(k==(i+1)) return k;
            
        }
        return k;
    }
}
