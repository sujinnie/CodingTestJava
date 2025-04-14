class Solution {
    public int solution(int order) {
        String[] arr = String.valueOf(order).split("");
        int answer = 0;
        for(String a : arr) {
            if(a.equals("3") || a.equals("6") || a.equals("9")) answer++;
        }
        return answer;
    }
}