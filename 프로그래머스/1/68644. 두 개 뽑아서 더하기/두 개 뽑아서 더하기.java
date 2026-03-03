import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        Set<Integer> s = new HashSet<>();
        
        for(int i=0; i< numbers.length - 1; i++){
            for(int j= i + 1; j< numbers.length; j++){
                s.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = s.stream().mapToInt(Integer::intValue).sorted().toArray();
        
        
        
        return answer;
    }
}