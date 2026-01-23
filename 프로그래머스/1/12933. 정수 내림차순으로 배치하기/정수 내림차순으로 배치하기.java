import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        
        while(n>0){
            long left = n%10;
            n/=10;
            list.add(left);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(Long a : list){
            answer*=10;
            answer+=a;
        }
        
        return answer;
    }
}