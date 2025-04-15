import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        //Integer.compare 가 잇엇다 1,0,-1
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(Arrays.stream(arr1).sum(), Arrays.stream(arr2).sum());
        }

        return answer;
        
//         int len1 = arr1.length;
//         int len2 = arr2.length;
        
//         if(len1 > len2) return 1;
//         else if(len1 < len2) return -1;
//         else {
//             int sum1 = Arrays.stream(arr1).sum();
//             int sum2 = Arrays.stream(arr2).sum();
            
//             if(sum1 > sum2) return 1;
//             else if(sum1 < sum2) return -1;
//             else return 0;
//         }
    }
}