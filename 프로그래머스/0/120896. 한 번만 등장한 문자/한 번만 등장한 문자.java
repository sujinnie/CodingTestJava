import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new TreeMap<>();
        for(String str : s.split("")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        String answer = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) answer += entry.getKey();
        }
        
        return answer;
    }
}