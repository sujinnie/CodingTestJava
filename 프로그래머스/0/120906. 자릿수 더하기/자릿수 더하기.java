class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] nStr = String.valueOf(n).split("");
        for(String s: nStr) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}