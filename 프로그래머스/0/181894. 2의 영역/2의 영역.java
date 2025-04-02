import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        List<Integer> answer = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                cnt++;
                idx.add(i);
            }
        }
        
        if(cnt == 0) answer.add(-1);
        else {
            for(int i=idx.get(0); i<= idx.get(idx.size()-1); i++) {
                answer.add(arr[i]);
            }   
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}