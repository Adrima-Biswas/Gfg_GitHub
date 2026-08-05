class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int max = -1;
        int second_max = max;
        
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                second_max = max;
                max = arr[i];
            }
            else if(second_max < arr[i] && arr[i] != max){
                second_max = arr[i];
            }
        }
        
        return second_max;
    }
   
}