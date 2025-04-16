// import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        StringBuilder answer = new StringBuilder(); 

        int i = a.length() - 1; // a의 끝 인덱스 (가장 낮은 자리수부터 계산)
        int j = b.length() - 1; // b의 끝 인덱스
        int carry = 0;          // 자리 올림(carry) 값

        // a, b를 뒤에서부터 계산하며 자리수가 남아 있거나 carry가 있으면 계속
        while (i>=0 || j>=0 || carry>0) {
            // a에서 현재 자리 숫자 꺼내기 (없으면 0)
            int digitA = i>=0 ? (a.charAt(i--) - '0') : 0;
            // b에서 현재 자리 숫자 꺼내기 (없으면 0)
            int digitB = j>=0 ? (b.charAt(j--) - '0') : 0;

            // 현재 자리수의 합 + 이전 자리에서 넘어온 carry
            int sum = digitA + digitB + carry;

            answer.append(sum%10); // 현재 자리수
            carry = sum/10; // 올림값
        }
        
        // 덧셈은 뒤에서부터 => 최종 결과는 뒤집어서 리턴
        return answer.reverse().toString();
        
        // 너무느린 빅인티저
        // BigInteger bigA = new BigInteger(a);
        // BigInteger bigB = new BigInteger(b);
        // BigInteger sum = bigA.add(bigB);
        // return String.valueOf(sum);
    }
}