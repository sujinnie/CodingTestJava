import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        // int[] answer = new int[num_list.length];
        List<Integer> answer = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if(n == 1) {
            // answer = Arrays.copyOfRange(num_list, 0, b+1);
            for(int i=0; i<=b; i++) {
                answer.add(num_list[i]);
            }
        } else if (n == 2) {
            // answer = Arrays.copyOfRange(num_list, a, num_list.length);
            for(int i=a; i<num_list.length; i++) {
                answer.add(num_list[i]);
            }
        } else if(n == 3) {
            // answer = Arrays.copyOfRange(num_list, a, b+1);
            for(int i=a; i<=b; i++) {
                answer.add(num_list[i]);
            }
        } else {
            for(int i=a; i<=b; i+=c) {
                answer.add(num_list[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}