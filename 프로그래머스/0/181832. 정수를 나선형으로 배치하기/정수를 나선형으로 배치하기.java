class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int row = 0; 
        int col = 0;
        int dir = 0; // 이동방향 (0: 우, 1: 하, 2: 좌, 3: 상)
        int val = 1; // answer 배열에 채워질 값 (1~n^2)
        
        while(val <= n*n) {
            answer[row][col] = val++;
            
            if(dir == 0) {
                if(col != n-1 && answer[row][col+1] == 0) {
                    col++;
                } 
                else { // 오른쪽 다 봤으면 아래 방향 탐색
                    dir = 1;
                    row++;
                }
            }
            else if(dir == 1) {
                if(row != n-1 && answer[row+1][col] == 0) {
                    row++;
                } 
                else { 
                    dir = 2;
                    col--;
                }
            }
            else if(dir == 2) {
                if(col > 0 && answer[row][col-1] == 0) {
                    col--;
                } 
                else { 
                    dir = 3;
                    row--;
                }
            }
            else if(dir == 3) {
                if(row > 0 && answer[row-1][col] == 0) {
                    row--;
                } 
                else { 
                    dir = 0;
                    col++;
                }
            }
        }
        
        return answer;
    }
}