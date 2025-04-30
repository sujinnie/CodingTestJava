import java.util.*;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        
        recursive("", numbers);
        
        for(int num : numberSet) {
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    public void recursive(String comb, String others) {
        //1. 조합을 hashset에 추가
        if(!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));
        //2. 숫자조각 하나씩 떼서 추가..
        for(int i=0; i<others.length(); i++) {
            recursive(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));   
        }
    }
    
    public boolean isPrime(int num) {
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;
        int limit = (int) Math.sqrt(num);
        for (int i=3; i<=limit; i+=2) {
            if(num%i == 0) return false;
        }
        return true;
    }
}