import java.util.*;

class Solution {
    public String solution(String letter) {
        // hashMap
        Map<String, Character> morseMap = new HashMap<>();
        morseMap.put(".-", 'a');
        morseMap.put("-...", 'b');
        morseMap.put("-.-.", 'c');
        morseMap.put("-..", 'd');
        morseMap.put(".", 'e');
        morseMap.put("..-.", 'f');
        morseMap.put("--.", 'g');
        morseMap.put("....", 'h');
        morseMap.put("..", 'i');
        morseMap.put(".---", 'j');
        morseMap.put("-.-", 'k');
        morseMap.put(".-..", 'l');
        morseMap.put("--", 'm');
        morseMap.put("-.", 'n');
        morseMap.put("---", 'o');
        morseMap.put(".--.", 'p');
        morseMap.put("--.-", 'q');
        morseMap.put(".-.", 'r');
        morseMap.put("...", 's');
        morseMap.put("-", 't');
        morseMap.put("..-", 'u');
        morseMap.put("...-", 'v');
        morseMap.put(".--", 'w');
        morseMap.put("-..-", 'x');
        morseMap.put("-.--", 'y');
        morseMap.put("--..", 'z');
        
        String answer = "";
        String[] splitted = letter.split(" ");
        for(String str : splitted) {
            answer += morseMap.get(str);
        }
        return answer;
        
        // arr
        // String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // String[] splitted = letter.split(" ");
        // String answer = "";
        // for(String str : splitted) {
        //     for(int i=0; i<morse.length; i++) {
        //         if(morse[i].equals(str)) {
        //             answer += (char) (i+97); // 아스키코드
        //         }
        //     }   
        // }
        // return answer;
    }
}