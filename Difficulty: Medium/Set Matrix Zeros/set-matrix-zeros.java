class Solution {
    public void setMatrixZeroes(int[][] arr) {
        
        int temp = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    if(j==0){
                        temp = 0;
                        continue;
                    }
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        
        for(int i=arr.length-1; i>0; i--){
            for(int j=arr[0].length-1; j>0; j--){
                if(arr[0][j] == 0 || arr[i][0] == 0){
                    arr[i][j] = 0;
                }
            }
        }
        
        for(int j=0; j<arr[0].length; j++){
            if(arr[0][j] == 0 || arr[0][0] == 0){
                arr[0][j] = 0;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i][0] == 0 || temp == 0){
                arr[i][0] = 0;
            }
        }
        
        
    }
}