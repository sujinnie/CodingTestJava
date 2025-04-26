class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[] dx = {1,1,0,-1,-1,-1,0,1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 1) {
                    for(int k=0; k<8; k++) {
                        int nx = i+dx[k];
                        int ny = j+dy[k];
                        if(nx>=n || nx<0 || ny>=n || ny<0) continue;
                        if(board[nx][ny] == 0) board[nx][ny] = -1;
                    }
                }
            }
        }
        
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<n; j++) {
        //         System.out.print(board[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        int answer = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}