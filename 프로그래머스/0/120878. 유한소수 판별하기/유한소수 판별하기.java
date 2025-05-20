class Solution {
    public int solution(int a, int b) {
        // 기약분수 확인 (분모만 체크)
        int g = gcd(a, b);
        b /= g;
        
        // 분모에서 2와 5만 남도록 계속 나누기
        while (b%2 == 0) b /= 2;
        while (b%5 == 0) b /= 5;

        return (b == 1) ? 1 : 2;
    }
    
    private int gcd(int a, int b) { // 두 수의 최대공약수 구하기
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}