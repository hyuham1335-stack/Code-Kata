import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_width = 0;
        int max_length = 0;
        
        for(int[] bc : sizes){
            if(max_width < Math.max(bc[0], bc[1])) {
                max_width = Math.max(bc[0], bc[1]);
            }
            
            if(max_length < Math.min(bc[0], bc[1])) {
                max_length = Math.min(bc[0], bc[1]);
            }
        }
        
        answer = max_length * max_width;
        
        return answer;
    }
}