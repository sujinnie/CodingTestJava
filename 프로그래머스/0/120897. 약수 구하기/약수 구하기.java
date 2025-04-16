import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=1; i*i <= n; i++) {
            if(n%i == 0) {
                answer.add(i);
                if(n/i != i) {
                    answer.add(n/i);
                }
            }
        }
        
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}