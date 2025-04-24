class Solution {
    public String solution(String polynomial) {
        int coef = 0;
        int constant = 0;
        
        String[] polyArr = polynomial.split(" ");
        for(String str : polyArr) {
            if(str.equals("+")) {
                continue;
            }
            else if(str.contains("x")) {
                int len = str.length();
                if(len == 1) coef += 1;
                else coef += Integer.parseInt(str.substring(0, len-1));
            }
            else {
                constant += Integer.parseInt(str);
            }
        }
        
        // 결과 문자열 만들기
        StringBuilder sb = new StringBuilder();
        if (coef > 0) {
            if (coef == 1) sb.append("x");
            else sb.append(coef).append("x");
        }
        if (constant > 0) {
            if (sb.length() > 0) sb.append(" + "); // x항이 있는 경우에만 + 추가
            sb.append(constant);
        }
        
        return sb.toString();
    }
}