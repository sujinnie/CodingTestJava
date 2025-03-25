import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
            int[] slicedArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // System.out.println(Arrays.toString(slicedArr));
            // int k=0;
            // int[] slicedArr = new int[commands[i][1] - commands[i][0] + 1];
            // for(int j=commands[i][0]; j<=commands[i][1]; j++) {
            //     slicedArr[k] = array[j-1];
            //     k++;
            // }
            Arrays.sort(slicedArr);
            answer[i] = slicedArr[commands[i][2]-1];
        }
        return answer;
    }
}