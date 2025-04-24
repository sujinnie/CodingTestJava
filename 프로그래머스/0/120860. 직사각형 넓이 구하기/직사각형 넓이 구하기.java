
class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        
        for(int i=1; i<4; i++) {
            if(dots[i][0] != x) width = Math.abs(x - dots[i][0]);
            if(dots[i][1] != y) height = Math.abs(y - dots[i][1]);
            
        }
        
        return width * height;
    }
}