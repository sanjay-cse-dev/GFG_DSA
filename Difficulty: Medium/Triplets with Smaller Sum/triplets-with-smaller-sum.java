class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int res = 0;
        for(int i=0; i<arr.length-2; i++){
            int j = i+1;
            int k = arr.length-1;
            
            while(j<k){
                int S = arr[i] + arr[j] + arr[k];
                if(S>=sum){
                    k--;
                }else{
                    res+=k-j;
                    j++;
                }
            }
        }
        return res;
    }
}