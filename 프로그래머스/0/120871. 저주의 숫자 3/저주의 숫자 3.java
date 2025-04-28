class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<n; i++) {
            answer++;
            while(answer%3 == 0 || String.valueOf(answer).contains("3")) {
                // System.out.println("저주 ans: " + answer);
                answer++;
            }
                // System.out.println("i: " + i + ", ans: " + answer);
        }
        return answer;
    }
}