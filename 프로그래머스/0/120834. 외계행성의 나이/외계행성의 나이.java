class Solution {
    public String solution(int age) {
        String alp = "abcdefghij";
        String ageStr = String.valueOf(age);
        String answer = "";
        for(int i=0; i<ageStr.length(); i++) {
            // String to int: Integer.parseInt(int) or Integer.valueOf(Integer)
            // char to int: Character.getNumericValue
            int idx = Character.getNumericValue(ageStr.charAt(i));
            answer += alp.charAt(idx);
        }
        return answer;
    }
}