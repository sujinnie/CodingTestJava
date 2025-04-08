import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<names.length; i+=5) {
            answer.add(names[i]);
        }
        return answer.stream().toArray(String[]::new);
        // int len = names.length;
        // int ansLen = len%5 == 0 ? len/5 : len/5+1;
        // int idx = 0;
        // String[] answer = new String[ansLen];
        // for(int i=0; i<len; i+=5) {
        //     answer[idx++] = names[i];
        // }
        // return answer;
    }
}