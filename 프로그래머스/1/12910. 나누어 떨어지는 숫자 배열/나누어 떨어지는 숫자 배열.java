import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        int[] answer;
        for(int a : arr){
            if(a%divisor == 0) list.add(a);
        }
        
        if(list.size() == 0) {
            answer = new int[]{-1};
        } else {
            Collections.sort(list);
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        
        
        return answer;
    }
}