class Solution {
    public int makeOne(int num) {
        if(num == 1) return 0;
        return 1 + makeOne(num/2); // 짝홀상관이 없다..
    }
    
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list) {
            answer += makeOne(num);
        }
        return answer;
        
        // for(int num : num_list) {
        //     while(num > 1) {
        //         num/=2;
        //         answer++;
        //     }
        // }
    }
}