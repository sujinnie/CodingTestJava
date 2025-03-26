import java.util.*;

class Solution {
    int[][] maps;
    boolean[][] visited;
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    class Point {
        int x,y,cnt;
        public Point(int x, int y, int cnt) {
            this.x = x; this.y = y; this.cnt = cnt;
        }
    }
    
    public int bfs(int sx, int sy, int ex, int ey) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(sx, sy, 1));
        visited[sx][sy] = true;
        
        while(!q.isEmpty()) {
            Point cur = q.poll();
            if(cur.x==ex && cur.y == ey) { // 목적지 도착하면 cnt 반환
                return cur.cnt;
            }
            for(int i=0; i<4; i++) {
                int nx = cur.x+dx[i];
                int ny = cur.y+dy[i];
                if(nx > ex || nx < 0 || ny > ey || ny < 0) continue;
                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new Point(nx, ny, cur.cnt+1));
                }
            }
        }
        return -1;
    }
    
    public int solution(int[][] maps) {
        this.maps = maps;
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m];
        
        return bfs(0,0,n-1,m-1);
    }
}