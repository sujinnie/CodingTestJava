import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int strLen = my_str.length();
        int len = strLen%n == 0 ? strLen/n : strLen/n + 1;
        String[] answer = new String[len];
        int idx = 0;
        for(int i=0; i<my_str.length(); i+=n) {
            answer[idx++] = my_str.substring(i, Math.min(i+n, strLen));
        }
        return answer;
    }
}