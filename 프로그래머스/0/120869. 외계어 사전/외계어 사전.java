import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String word : dic) {
            // 알파벳별 등장횟수 저장..
            Map<Character, Integer> freq = new HashMap<>();
            for(char c : word.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
            
            // 알파벳이 한번씩만 등장했는지 체크
            boolean isValid = true;
            for(String alpha : spell) {
                char alphaChar = alpha.charAt(0);
                if(!freq.containsKey(alphaChar) || freq.get(alphaChar) != 1) {
                    isValid = false;
                    break;
                }
            }
            
            if(isValid) return 1;
        }
        
        return 2;
    }
}