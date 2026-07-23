class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1; int high = stalls[n-1] - stalls[0];
        int res = -1;
        while(low<=high){
            int guess = low+(high-low)/2;
            
            boolean isPlaced = helperFun(stalls,guess,k);
            
            if(isPlaced){
                res = guess;
                low = guess+1;
            }else{
                high = guess-1;
            }
        }
        return res;
    }
    
    private static boolean helperFun(int[] stalls, int guess, int k){
        int cows = 1;
        int prev = stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - prev >= guess){
                cows++; 
                prev = stalls[i];
            }
            if(cows >= k) return true;
        }
        return false;
    }
}