class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=4; i<=n; i++) {
            if(isCompositeNum(i)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isCompositeNum(int num) {
        if(cntFactors(num) >= 3) return true;
        return false;
    }
    
    public int cntFactors(int num) {
        int cnt = 0;
        for(int i=1; i*i<=num; i++) {
            if(i*i == num) cnt++;
            else if(num%i == 0) cnt+=2;
        }
        return cnt;
    }
}