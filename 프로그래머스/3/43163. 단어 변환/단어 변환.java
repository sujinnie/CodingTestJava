import java.util.*;

class Solution {
    String[] words;
    boolean[] visited;
    
    class Node {
        String word; 
        int cnt;
        public Node(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
    
    public int bfs(String begin, String target) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(begin, 0));
        
        while(!q.isEmpty()) {
            Node cur = q.poll();
            if(cur.word.equals(target)) {
                return cur.cnt;
            }
            
            for(int i = 0; i<words.length; i++) {
                if(isConvertable(cur.word, words[i]) && !visited[i]) {
                    visited[i] = true;
                    q.add(new Node(words[i], cur.cnt+1)); // 단어별 depth를 같이 기록
                }
            }
        }
        return 0;
    }
    
    public boolean isConvertable(String cur, String word) {
        int diff = 0;
        for(int i = 0; i<cur.length(); i++) {
            if(cur.charAt(i) != word.charAt(i)) {
                diff++;
            }
        }
        if(diff == 1) return true;
        else return false;
    }
    
    public int solution(String begin, String target, String[] words) {
        this.words = words;
        visited = new boolean[words.length];
        
        if(!Arrays.asList(words).contains(target)) {
            return 0;
        }
        
        return bfs(begin, target);
    }
}