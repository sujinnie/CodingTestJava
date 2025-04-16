import java.util.*;

class Solution {
    public String solution(String s) {
        // cnt 배열
        int[] cnt = new int[26];
        for(char c : s.toCharArray()) {
            cnt[c-'a']++; 
        }
        
        String answer = "";
        for(int i=0; i<26; i++) {
            if(cnt[i] == 1) answer += (char)(i+'a');
        }
        
        return answer;
        
        // treeMap
//         Map<String, Integer> map = new TreeMap<>();
//         for(String str : s.split("")) {
//             map.put(str, map.getOrDefault(str, 0) + 1);
//         }
        
//         String answer = "";
//         for(Map.Entry<String, Integer> entry : map.entrySet()) {
//             if(entry.getValue() == 1) answer += entry.getKey();
//         }
        
//         return answer;
    }
}