class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array) {
            String aStr = String.valueOf(a);
            for(char c : aStr.toCharArray()) {
                if(c == '7') answer++;
            }
        }
        return answer;
    }
}