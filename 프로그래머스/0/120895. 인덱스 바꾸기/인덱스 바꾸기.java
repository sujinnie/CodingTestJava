class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] splitted = my_string.split("");
        String tmp = splitted[num1];
        splitted[num1] = splitted[num2];
        splitted[num2] = tmp;
        return String.join("", splitted);
    }
}