class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<myString.length()-1; i++) {
            for(int j=i+1; j<=myString.length(); j++) {
                String subStr = myString.substring(i,j); 
                if(subStr.equals(pat)) answer++;
            }
        }
        return answer;
    }
}