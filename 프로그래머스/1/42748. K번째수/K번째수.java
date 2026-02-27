import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i< commands.length; i++){
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArray);
            list.add(subArray[commands[i][2] - 1]);
        }
        
        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}