import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        answer = new StringBuilder(new String(c)).reverse().toString();
        
        return answer;
    }
}