import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        // trim 앞뒤공백제거, \\s+ 하나이상의 공백
        return my_string.trim().split("\\s+");
    }
}