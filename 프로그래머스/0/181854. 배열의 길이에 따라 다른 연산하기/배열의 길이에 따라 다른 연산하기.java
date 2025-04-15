class Solution {
    public int[] solution(int[] arr, int n) {
        int aLen = arr.length;
        if(aLen%2 == 0) {
            for(int i=1; i<aLen; i+=2) {
                arr[i]+=n;
            }
        }
        else {
            for(int i = 0; i<aLen; i+=2) {
                arr[i]+=n;
            }
        }
        
        return arr;
    }
}