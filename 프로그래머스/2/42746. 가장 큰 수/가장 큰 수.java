import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        String[] numStrArr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            numStrArr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(numStrArr, (o1,o2)->{
            String s1 = o1+o2;
            String s2 = o2+o1;
            return s2.compareTo(s1);
        });
        
        if(numStrArr[0].equals("0")) return "0";
        
        return String.join("",numStrArr);
    }
}