class Solution {
    public int solution(int n, int k) {
        int svc = 0;
        if(n >= 10) svc = n/10;
        return 12000*n + 2000*(k-svc);
    }
}