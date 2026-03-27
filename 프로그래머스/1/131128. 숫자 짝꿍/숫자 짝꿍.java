import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String X, String Y) {

        String answer = "";
        
        int[] a = new int[10];
        int[] b = new int[10];
        
        for(int i = 0 ; i < X.length() ; i++){
            a[X.charAt(i) - '0']++;
        }
        
        for(int i = 0 ; i < Y.length() ; i++){
            b[Y.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 9 ; i >= 0 ; i--){
            for(int j = 0 ; j < Math.min(a[i], b[i]) ; j ++){
                sb.append(i);
            }
        }
        
        String s = sb.toString();
        
        if(s.equals("")) {
            answer = "-1";
        } else if (s.charAt(0) == '0'){
            answer = "0";
        } else {
            answer = s;
        }
        
        return answer;
    }
}