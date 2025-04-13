import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        
        // Stack
        Stack<Integer> stk = new Stack<>();
        for(String str : arr) {
            if(str.equals("Z")) {
                stk.pop();
            }
            else {
                stk.push(Integer.parseInt(str));
            }
        }
        for(int num : stk) {
            answer+=num;
        }
        
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i].equals("Z")) {
        //         answer -= Integer.parseInt(arr[i-1]);
        //     }
        //     else {
        //         answer+= Integer.parseInt(arr[i]);
        //     }
        // }
        return answer;
    }
}