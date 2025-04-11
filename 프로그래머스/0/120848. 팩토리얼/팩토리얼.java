class Solution {
    public int solution(int n) {
        int i = 1;
        while(fact(i) <= n) {
            i++;
        }
        return i-1;
    }
    public int fact(int num) {
        if(num == 1) return 1;
        return num * fact(num-1);
    }
}