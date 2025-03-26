import java.util.*;

class Solution {
    int n, cnt;
    int[][] computers;
    boolean[] visited;
    
    public void dfs(int start) {
        visited[start] = true;
        for(int i=0; i<n; i++) {
            if(!visited[i] && computers[start][i] == 1) {
                dfs(i);
            }
        }
    }
    
    public void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int i=0; i<n; i++) {
                if(!visited[i] && computers[cur][i] == 1) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        
        cnt=0;
        visited = new boolean[n];
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                bfs(i);
                cnt++;
            }
        }
        
        return cnt;
    }
}