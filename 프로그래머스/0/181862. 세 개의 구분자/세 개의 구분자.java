import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        String[] splitted = myStr.split("a|b|c");
        for(String str : splitted) {
            if(!str.isEmpty()) answer.add(str);
        }
        if(answer.isEmpty()) answer.add("EMPTY");
        return answer.stream().toArray(String[]::new);
    }
}