class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];
        
        // double slope1 = (double)(y2-y1) / (x2-x1);
        // double slope2 = (double)(y4-y3) / (x4-x3);
        if((y2-y1)*(x4-x3) == (x2-x1)*(y4-y3)) return 1;
        if((y3-y1)*(x4-x2) == (x3-x1)*(y4-y2)) return 1;
        if((y4-y1)*(x3-x2) == (x4-x1)*(y3-y2)) return 1;
        
        return 0;
    }
}