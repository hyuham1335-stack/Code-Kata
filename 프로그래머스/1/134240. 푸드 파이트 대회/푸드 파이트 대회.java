import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "0";
        Stack<Integer> s = new Stack<>();
        
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
               s.push(i);
            }
        }
        
        while(!s.empty()){
            answer = s.peek() + answer + s.peek();
            s.pop();
        }
            
        
        return answer;
    }
}