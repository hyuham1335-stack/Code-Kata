import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] c = {0,0,0};

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++){
            if(a1[i%a1.length] == answers[i]) {c[0]++;}
            if(a2[i%a2.length] == answers[i]) {c[1]++;}
            if(a3[i%a3.length] == answers[i]) {c[2]++;}
        }
        
        int max = Math.max(c[0], Math.max(c[1], c[2]));
        
        List<Integer> list = new ArrayList<>();
        
        if(max == c[0]) list.add(1);
        if(max == c[1]) list.add(2);
        if(max == c[2]) list.add(3);
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
}