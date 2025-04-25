class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";
        
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                num += c;
            }
            else {
                if(!num.isEmpty()) {
                    answer += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        
        // 문자열이 숫자로 끝났을 때 ..
        if(!num.isEmpty()) {
            answer += Integer.parseInt(num);
        }
        
        return answer;
        
        // 정규식 split
        // int answer = 0;
        // String[] splitted = my_string.split("[a-zA-Z]+");
        // for(String a : splitted) {
        //     if(!a.isEmpty()) answer += Integer.parseInt(a);
        // }
        // return answer;
    }
}