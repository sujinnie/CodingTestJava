import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];
        
        for(int i=1; i<sides[0]+sides[1]; i++){
            // 나머지 한 변 i가 가장 큰 변일 때
            if(i > max){
                if(min+max > i){
                    answer++;
                }
            } else {
                if(min+i > max){
                    answer++;
                }
            }
        }

        return answer;
    }
}