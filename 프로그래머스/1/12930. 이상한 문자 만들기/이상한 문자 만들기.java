import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String answer = "";       
        
        char[] arr = s.toCharArray();
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(!Character.isWhitespace(arr[i])){
                if(j%2==0) arr[i] = Character.toUpperCase(arr[i]);
                else arr[i] = Character.toLowerCase(arr[i]);
                j++;
                
            } else {
                j=0;
            }
        }
        answer = new String(arr);
        return answer;
    }
}