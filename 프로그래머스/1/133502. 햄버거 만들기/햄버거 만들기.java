import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();    
    
        for(int x : ingredient){
            sb.append(x);
            
            if(sb.length() >= 4){
                int len = sb.length();
                
                if(sb.charAt(len-4) == '1' &&
                  sb.charAt(len-3) == '2' &&
                  sb.charAt(len-2) == '3' &&
                  sb.charAt(len-1) == '1') {
                    sb.delete(len-4, len);
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}