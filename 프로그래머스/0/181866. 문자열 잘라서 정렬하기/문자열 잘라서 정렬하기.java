import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitted = myString.split("x");
        System.out.println(Arrays.toString(splitted));
        
        List<String> answer = new ArrayList<>();
        for(int i=0; i<splitted.length; i++) {
            if(!splitted[i].equals("")) answer.add(splitted[i]);
        }
        Collections.sort(answer);
        return answer.stream().toArray(String[]::new);
    }
}