class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char c : myString.toCharArray()) {
            if((int)(c-'a') < 11) answer+="l";
            // if(c>='a' && c<='k') answer+="l";
            else answer+=c;
        }
        return answer;
    }
}