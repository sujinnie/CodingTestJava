import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int diff = 100;
        int answer = 0;
        for(int num : array) {
            if(Math.abs(num-n) < diff) {
                diff = Math.abs(num-n);
                answer = num;
            }
            else if(Math.abs(num-n) == diff) {
                answer = Math.min(answer, num);
            }
        }
        return answer;
    }
}