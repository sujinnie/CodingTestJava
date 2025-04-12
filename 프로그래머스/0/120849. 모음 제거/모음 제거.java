class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]","");
        // return my_string.replaceAll("a","").replaceAll("e","").replaceAll("i","").replaceAll("o","").replaceAll("u","");
    }
}