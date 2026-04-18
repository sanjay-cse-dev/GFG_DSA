int getSecondLargest(int *arr, int n) {
    int max = -1; 
    int Smax = -1;
    
    for(int i=0; i<n; i++){
    if(arr[i] > max){ 
        Smax = max;
        max = arr[i];
        }
        else if(arr[i]<max && arr[i]>Smax){
            Smax = arr[i];
        }
    }
    return Smax;
}
