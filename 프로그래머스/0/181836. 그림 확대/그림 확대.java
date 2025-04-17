import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for(String str : picture) {
            String kMul = "";
            for(String pixel : str.split("")) {
                kMul += pixel.repeat(k);
            }
            for(int i=0; i<k; i++) {
                answer.add(kMul);
            }
            
        }
        return answer.stream().toArray(String[]::new);
    }
}