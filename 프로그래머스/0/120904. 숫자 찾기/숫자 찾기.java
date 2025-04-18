class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        int answer = numStr.indexOf(String.valueOf(k));
        return answer == -1 ? -1 : answer+1;
    }
}