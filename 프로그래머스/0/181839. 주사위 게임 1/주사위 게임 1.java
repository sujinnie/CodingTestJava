class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        boolean aFlag = a%2 == 0 ? true:false;
        boolean bFlag = b%2 == 0 ? true:false;
        
        if(!aFlag && !bFlag) answer = a*a + b*b;
        else if(!aFlag || !bFlag) answer = 2*(a+b);
        else answer = Math.abs(a-b);
        
        return answer;
    }
}