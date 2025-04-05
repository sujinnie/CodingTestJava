import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        
        // treeSet => 중복값 저장x, 오름차순 정렬o
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            answer.add(iter.next());
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
        // return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}