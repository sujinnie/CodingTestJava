class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int minX = board[0]/2 * -1;
        int maxX = board[0]/2;
        int minY = board[1]/2 * -1;
        int maxY = board[1]/2;
        
        for(String key : keyinput) {
            int curX = answer[0];
            int curY = answer[1];
            
            if(key.equals("up") && curY<maxY) answer[1]++;
            else if(key.equals("down") && curY>minY) answer[1]--;
            else if(key.equals("left") && curX>minX) answer[0]--;
            else if(key.equals("right") && curX<maxX) answer[0]++;
        }
        
        return answer;
    }
}