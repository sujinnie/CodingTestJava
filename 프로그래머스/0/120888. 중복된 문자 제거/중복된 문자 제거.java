import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] splitted = my_string.split("");
        Set<String> set = new LinkedHashSet<>();
        for(String str : splitted) {
            set.add(str);
        }
        answer = String.join("", set);
        // for(int i=0; i<my_string.length(); i++) {
        //     if(!answer.contains(String.valueOf(my_string.charAt(i)))){
        //         answer+=my_string.charAt(i);
        //     }
        // }
        return answer;
    }
}