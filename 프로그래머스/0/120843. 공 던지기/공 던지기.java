class Solution {
    public int solution(int[] numbers, int k) {
        // idx? 한칸씩 건너뜀, 0부터 시작 => 2(k-1)
        return numbers[2*(k-1) % numbers.length];
    }
}