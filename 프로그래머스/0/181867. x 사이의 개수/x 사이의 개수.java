import java.util.*;

class Solution {
    public int[] solution(String myString) {
        /* 
            split(String str, int limit)
            limit > 0 : limit 개수만큼 split
            limit == 0 : 맨 뒤의 값이 빈값이면 생략
            limit < 0 : 맨 뒤의 빈값에 대해 split을 모두 진행
        */
        String[] splitted = myString.split("x", -1);
        // System.out.println(Arrays.toString(splitted));
        int[] answer = new int[splitted.length];
        for(int i=0; i<splitted.length; i++) {
            answer[i] = splitted[i].length();
        }
        return answer;
    }
}