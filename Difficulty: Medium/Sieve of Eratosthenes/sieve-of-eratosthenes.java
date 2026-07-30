class Solution {
    public ArrayList<Integer> sieve(int n) {
        int[] arr = new int[n + 1];
        
        for(int i = 2;i <= n; i++){
            if(arr[i] == 0) {
                for(int j = i * 2; j <=n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i < arr.length; i++){
            if(arr[i] == 0){
            list.add(i);
            }
        }
        return list;
    }
    /*
    public boolean prime(int num){
        for(int i = 2; i * i <= num; i++){   // O(n) -> O(_/n) 
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> sieve(int n) { // O(n2) -> O(n * _/n)
        // code here 
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(prime(i)) {
                arr.add(i);
            }
        }
        return arr;
    }
    */
}