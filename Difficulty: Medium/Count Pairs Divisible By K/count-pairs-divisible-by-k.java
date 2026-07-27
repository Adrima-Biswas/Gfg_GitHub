class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        int[] remenderStorage = new int[k];
        int pair = 0;
        
        for(int ele : arr){
            int rem_currElement = ele % k;
            int rem_next = (k - rem_currElement) % k;
            pair += remenderStorage[rem_next];
            remenderStorage[rem_currElement]++;
        }
        return pair;
    }
}