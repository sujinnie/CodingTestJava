class Solution {
    int answer, target;
    int[] numbers;
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        dfs(0,0);
        
        return answer;
    }
    public void dfs(int idx, int sum) {
        // 탈출조건
        if(idx == numbers.length) {
            if(sum==target) answer++;
            return;
        }
        // 탐색.. (+,-)
        dfs(idx+1, sum+numbers[idx]);
        dfs(idx+1, sum-numbers[idx]);
    }
}