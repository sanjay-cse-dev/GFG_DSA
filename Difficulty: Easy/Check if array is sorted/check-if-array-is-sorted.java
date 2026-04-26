class Solution {
    public boolean isSorted(int[] arr) {
//         if(arr.length == 2){
//             if(arr[0] > arr[1]) return false;
//             else return true;
//         }
//         else if(arr.length == 1) return true;

//         int idx = 1;
//         return sortedArr(arr,idx);
//     }
//     public static boolean sortedArr(int[] arr, int idx){
//         if(idx == arr.length-1) return true;
//         if(arr[idx]>arr[idx+1] || arr[idx] < arr[idx-1]) return false;
//         return sortedArr(arr,idx+1);
//     }
// }



// class Solution {
//     public boolean isSorted(int[] arr) {
//         // code here
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i] > arr[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }


// class Solution {
//     public boolean isSorted(int[] arr) {
//         // code here
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i] > arr[i+1]){
//                 return false;
//             }
//         }
//         return true;



    for(int i=0; i<arr.length-1; i++){
        if(arr[i]>arr[i+1]) return false;
    }
    return true;

//Done
















































    }
}
