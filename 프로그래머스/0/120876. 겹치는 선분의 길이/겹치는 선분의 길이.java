import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> intersectMap = new HashMap<>();
        for(int[] line : lines) {
            for(int i=line[0]; i<line[1]; i++) {
                intersectMap.put(i, intersectMap.getOrDefault(i, 0) + 1);
            }
        }
        
        int answer = 0;
        for(Integer key : intersectMap.keySet()) {
            if(intersectMap.get(key) > 1) answer++;
        }
        
        return answer;
    }
}