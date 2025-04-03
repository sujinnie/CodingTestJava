import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int even = 0;
        int odd = 0;
        
        for(int num : num_list) {
            if(num%2 == 0) even++;
            else odd++;
        }
        
        answer.add(even); answer.add(odd);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}