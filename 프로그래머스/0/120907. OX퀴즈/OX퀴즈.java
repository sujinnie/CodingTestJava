class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++) {
            String[] splitted = quiz[i].split(" ");
            if(isCorrect(splitted)) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
    
    public boolean isCorrect(String[] splitted) {
        String optr = splitted[1];
        int num1 = Integer.parseInt(splitted[0]);
        int num2 = Integer.parseInt(splitted[2]);
        int ans = Integer.parseInt(splitted[4]);
        
        if(optr.equals("+")) {
            if(num1 + num2 == ans) return true;
            else return false;
        }
        else {
            if(num1 - num2 == ans) return true;
            else return false;
        }
    }
}