import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zero_count = 0;
        int count = 0;
        
        Arrays.sort(lottos);
        
        for(int i = 0 ; i < lottos.length ; i++){
            if(lottos[i] == 0) {
                zero_count++;
                continue;
            }
            
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                    break;
                }
            }
        }
        
        answer[1] = (7 - count) < 6  ? 7 - count : 6;
        answer[0] = (7 - (count + zero_count)) < 6 ? (7 - (count + zero_count)) : 6;
        
        return answer;
    }
}