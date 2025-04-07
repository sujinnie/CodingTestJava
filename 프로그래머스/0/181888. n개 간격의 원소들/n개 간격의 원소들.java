import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // arrayList
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
        
        // array -> 크기지정
        // int len = num_list.length%n == 0 ? num_list.length/n : num_list.length/n + 1;
        // int[] answer = new int[len];
        // int idx = 0;
        // for(int i=0; i<num_list.length; i+=n) {
        //     answer[idx++] = num_list[i];
        // }
        // return answer;
    }
}