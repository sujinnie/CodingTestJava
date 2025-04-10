class Solution {
    public int solution(int[] box, int n) {
        int w = box[0];
        int d = box[1];
        int h = box[2];
        return (w/n) * (d/n) * (h/n);
    }
}