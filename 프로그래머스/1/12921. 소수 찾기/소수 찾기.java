import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=3; i<=n; i++) {
            if(isPrime(i)) answer++;
        }
        return answer;
    }
    
    // 소수 판별 메서드
    private boolean isPrime(int num) {
    	// 2부터 num의 제곱근까지만 반복 (에라토스테네스의 체)
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <=limit; i++) {
            if (num % i == 0) { // 짝수는 걸러
                return false;
            }
        }
        return true;
    }
}