class Solution {
    public String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
        // String answer = "";
        // for(int i=0; i<myString.length(); i++) {
        //     if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A') answer+='A';
        //     else answer+=String.valueOf(myString.charAt(i)).toLowerCase();
        // }
        // return answer;
    }
}