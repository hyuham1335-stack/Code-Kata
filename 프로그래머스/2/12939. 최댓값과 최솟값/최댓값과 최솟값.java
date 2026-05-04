import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("\\s");
        
        int[] arr2 = Arrays.stream(arr)
            .mapToInt(Integer::parseInt)
            .toArray();
        
        Arrays.sort(arr2);
        
        answer = arr2[0] + " " + arr2[arr.length - 1];
        
        return answer;
    }
}