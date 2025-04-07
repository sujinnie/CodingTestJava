import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        // int[][] arr로 풀기
        int len = emergency.length;
        int[] answer = new int[len];
        int[][] map = new int[len][2];
        for(int i=0; i<len; i++) {
            map[i][0] = emergency[i];
            map[i][1] = i;
        }
        
        Arrays.sort(map, (a,b) -> b[0]-a[0]); // 응급도기준 내림차순정렬..
        for(int i=0; i<len; i++) {
            int originIdx = map[i][1];
            answer[originIdx] = i+1;
        }
        
        return answer;
        
        // 처음생각 Map
//         Integer[] tmp = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
//         Arrays.sort(tmp, Collections.reverseOrder());
        
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i<tmp.length; i++) {
//             map.put(tmp[i], i+1);
//         }
        
//         int[] answer = new int[emergency.length];
//         for(int i=0; i<emergency.length; i++) {
//             answer[i] = map.get(emergency[i]);
//         }
        
//         return answer;
    }
}