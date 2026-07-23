class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int low = 1;
        int high = arr[n-1] - arr[0];
        int res = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            boolean dist = maxDist(arr,mid,k);
            if(dist){
                res = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
    private static boolean maxDist(int[] arr, int mid, int k){
        int cow = 1;
        int pos = arr[0];
        for(int i=1; i<arr.length; i++){
            int dist = arr[i] - pos;
            if(dist < mid) continue;
            
            cow++;
            pos = arr[i];
        }
        if(cow >= k) return true;
        else return false;
        
    }
}