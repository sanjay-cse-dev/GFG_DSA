class Solution {
    public char getMaxOccuringChar(String s) {
        
        int maxfreq = -1;
        char ans = s.charAt(0);
        
        for(int i=0; i<s.length(); i++){
            int freq = 0; 
            char ch = s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j)==ch) freq++;
            }
            if(maxfreq < freq){
                maxfreq = freq;
                ans = ch;
            }
            else if(maxfreq == freq && ch < ans) ans = ch;
        }
        return ans;
    }
}