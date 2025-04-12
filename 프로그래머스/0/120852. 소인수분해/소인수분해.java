import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            while(n%i == 0) {
                if(!answer.contains(i)) answer.add(i);
                n /= i;
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}