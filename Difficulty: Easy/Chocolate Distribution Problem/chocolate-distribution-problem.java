class Solution {
    public int findMinDiff(int arr[], int m) {
        
        // We need to find such a section of array of size m,
        // where the difference b/w max and min is as minimum as possible.
        
        // [3, 4, 1, 9, 56, 7, 9, 12]
        
        // [1', 3'', 4''', 7'''', 9', 9'', 12''', 56''''] m = 5
        Arrays.sort(arr);
       int min = Integer.MAX_VALUE;
       int dif1 = min;
    //   while()
       for(int i = 0; i < arr.length - m + 1; i++){
           dif1 = arr[i + m - 1] - arr[i];
           min = Math.min(dif1 , min);
       }
       return min;
    }
}

// 11 13 7 5 13 12 -> s = 6
// 5 7 11 12 13 13 -> m = 4