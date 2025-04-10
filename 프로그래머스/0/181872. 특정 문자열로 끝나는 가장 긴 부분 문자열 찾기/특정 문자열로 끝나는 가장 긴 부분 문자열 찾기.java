class Solution {
    public String solution(String myString, String pat) {
        // 1. substring, endsWith
        // String answer = "";
        // for(int i=myString.length(); i>=0; i--) {
        //     String subStr = myString.substring(0,i);
        //     if(subStr.endsWith(pat)) {
        //         answer = subStr;
        //         break;
        //     }
        // }
        // return answer;
        
        // 2. lastIndexOf: 뒤에서부터 찾아서 해당 문자열 시작인덱스 반환
        int lastIdx = myString.lastIndexOf(pat);
        return myString.substring(0, lastIdx) + pat;
    }
}