import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;

        // 2의 거듭제곱 중 arr.length 이상인 최소값 찾기
        int targetLen = 1;
        while (targetLen < len) {
            targetLen *= 2;
        }

        // 배열 확장+복사 (빈 공간은 자동으로 0)
        return Arrays.copyOf(arr, targetLen);
    }
    
//     public boolean isPowerOfTwo(int num) {
//         // 비트연산: 2의 거듭재곱은 10,100,... -1은 1,11,111,...
//         if(num&(num-1) == 0) retur true;
//         else false;
        
//         // if(num % 2 != 0) return false;
//         // while(num > 2) {
//         //     num/=2;
//         // }
//         // return true;
//     }
}