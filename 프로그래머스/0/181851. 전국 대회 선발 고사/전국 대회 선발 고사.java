import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 랭크 모두 다름 => key: 랭크, value: 학생번호
        Map<Integer, Integer> student = new TreeMap<>((o1, o2) -> o1-o2); 
        for(int i=0; i<attendance.length; i++) {
            if(attendance[i]) student.put(rank[i], i);
        }
        List<Integer> top3 = new ArrayList<>(student.values()).subList(0, 3);
        return top3.get(0)*10000 + top3.get(1)*100 + top3.get(2);
    }
}