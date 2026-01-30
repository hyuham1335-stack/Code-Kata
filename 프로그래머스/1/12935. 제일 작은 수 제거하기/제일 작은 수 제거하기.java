import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = Collections.min(list);
        list.remove(list.indexOf(min));

        if(list.size() == 0) answer = new int[]{-1};
        else answer = list.stream().mapToInt(Integer::intValue).toArray();

        
        return answer;
    }
}