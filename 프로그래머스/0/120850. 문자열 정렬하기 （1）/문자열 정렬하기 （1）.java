import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                answer.add(Character.getNumericValue(c));
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}