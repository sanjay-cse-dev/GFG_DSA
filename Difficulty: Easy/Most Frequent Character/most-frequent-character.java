class Solution {
    public char getMaxOccuringChar(String s) {
        int n = s.length();
        int[] freq = new int[26];
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i=0; i<26; i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // int n = arr.length;
        // int maxfreq = 0; int freq = 0;
        // int i = 0, j = 0;
        // char ans = arr[0];
        // while(j<n){
        //     if(arr[i] != arr[j]){
        //         freq = j-i;
        //         if(freq>maxfreq){
        //             maxfreq = freq;
        //             ans = arr[i];
        //         }
        //         i=j;
        //     }else j++;
        // }
        // freq = j-i;
        // if(freq>maxfreq){
        //     maxfreq = freq;
        //     ans = arr[i];
        // }
        // return ans;
    }
}