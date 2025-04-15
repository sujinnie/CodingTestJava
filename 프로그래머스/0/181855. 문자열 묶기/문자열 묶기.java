import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        int cnt[] = new int[31];
        for(String str : strArr) {
            cnt[str.length()]++;
        }
        for(int a : cnt) {
            if(max < a) {
                max = a;
            }
        }
        return max;
        // return Arrays.stream(cnt).max().getAsInt();
    }
}