import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int answer = 0;

        // sides[2]가 가장 긴 변인 경우
        int maxSide = sides[1];
        int otherSide = 1;
        while(otherSide <= sides[1]) {
            if(sides[0] + otherSide > sides[1]) {
                answer++;
                System.out.println(otherSide);
            }
            otherSide++;
        }
        
        // 나머지 한 변이 가장 긴 변인 경우
        otherSide = sides[1]+1;
        while(sides[1] < otherSide) {
            if(sides[0] + sides[1] > otherSide) {
                answer++;
                System.out.println(otherSide);
            }
            otherSide++;
        }
        
        return answer;
    }
}