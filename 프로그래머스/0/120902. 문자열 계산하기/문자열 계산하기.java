class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = (!strArr[0].equals("+") || !strArr[0].equals("-")) ? Integer.parseInt(strArr[0]) : 0;
        for(int i=0; i<strArr.length-1; i++) {
            if(strArr[i].equals("+")) {
                answer += Integer.parseInt(strArr[i+1]);
            } else if(strArr[i].equals("-")) {
                answer -= Integer.parseInt(strArr[i+1]);
            }
        }
        return answer;
    }
}