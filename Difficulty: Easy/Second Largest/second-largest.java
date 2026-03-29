class Solution {
    public int getSecondLargest(int[] arr) {
        // code her
        int max = 0;
        int Secondmax = 0;
        
        for(int i=0; i<(arr.length); i++){
            if(arr[i] >= max){
                if(arr[i] != max){
                    Secondmax = max;
                }
                max = arr[i];
            }
            else if(arr[i] >= Secondmax && arr[i] != max){
                Secondmax = arr[i];
            }
        }
        if(max == Secondmax || Secondmax == 0) return -1;
        else return Secondmax;
        
    }
}