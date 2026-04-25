// class Solution {
//     public int getSecondLargest(int[] arr) {
//         // code her
//         int max = 0;
//         int Secondmax = 0;
        
//         for(int i=0; i<(arr.length); i++){
//             if(arr[i] >= max){
//                 if(arr[i] != max){
//                     Secondmax = max;
//                 }
//                 max = arr[i];
//             }
//             else if(arr[i] >= Secondmax && arr[i] != max){
//                 Secondmax = arr[i];
//             }
//         }
//         if(max == Secondmax || Secondmax == 0) return -1;
//         else return Secondmax;
        
//     }
// }


class Solution {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int Smax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                Smax = max; 
                max = arr[i];
            }
            else if(arr[i]!=max && Smax<max && Smax<arr[i]){
                Smax = arr[i];
            }
        }
        if(Smax == max) return -1;
        if(Smax == Integer.MIN_VALUE) return -1;
        return Smax;
        
    }
}
