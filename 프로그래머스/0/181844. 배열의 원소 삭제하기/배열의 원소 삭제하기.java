import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for(int arrNum : arr) {
            answer.add(arrNum);
        }
        for(int deleteNum: delete_list) {
            answer.remove(Integer.valueOf(deleteNum));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}