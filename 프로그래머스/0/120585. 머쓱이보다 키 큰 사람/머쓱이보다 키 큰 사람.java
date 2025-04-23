import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int len = array.length;
        
        Arrays.sort(array);
        
        if(height<array[0]) return len;
        else if(array[len-1] < height) return 0;
        else {
            for(int i=len-1; i>=0; i--) {
                if(array[i] > height) answer++;
                else break;
            }
            return answer;
        }
    }
}