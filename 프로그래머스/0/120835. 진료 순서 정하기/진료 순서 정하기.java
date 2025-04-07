import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] tmp = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tmp.length; i++) {
            map.put(tmp[i], i+1);
        }
        
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}