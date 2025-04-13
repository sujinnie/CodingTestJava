import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>(); // 중복제거 + 순서유지
        for(int num : arr) {
            set.add(num);
            if(set.size() == k) break;
        }
        
        List<Integer> answer = new ArrayList<>(set);
        while(answer.size() < k) {
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}