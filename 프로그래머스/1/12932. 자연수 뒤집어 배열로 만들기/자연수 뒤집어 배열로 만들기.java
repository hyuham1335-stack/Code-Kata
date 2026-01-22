import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        
        while(n>0){
            int left = (int)(n%10);
            q.offer(left);
            n /= 10;
        }
       
        answer = new int[q.size()];
        
        int i =0;
        while(!q.isEmpty()){
            answer[i++] = q.poll();
        }
        
        return answer;
    }
}