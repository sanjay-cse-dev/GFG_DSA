class Solution {
    int countFreq(int[] arr, int target) {
        int low = 0; 
        int high = arr.length-1;
        int idx1 = 0;
        int idx2 = -1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid] == target){
                idx1 = mid;
                high = mid-1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else low = mid+1;
        }
        
        low = 0; 
        high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid] == target){
                idx2 = mid;
                low = mid+1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else low = mid+1;
        }
        return idx2-idx1+1;
    }
}





// class Solution {
//     int countFreq(int[] arr, int target) {
//         int len = arr.length;
//         int count = 0;
//         for(int i=0; i<len; i++){
//             if(arr[len-1] < target){
//                 return 0;
//             }
//             else{
//                 if(arr[i]==target) count += 1;
//             }
//         }
//         return count;
//     }
// }
