import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<section.length;i++){
            pq.add(section[i]);
        }
        
        int cur = 0;
        
        while(!pq.isEmpty()){
            if(cur < pq.peek()){
                cur = pq.peek() + m - 1;
                answer++;
            } 
            pq.poll();
        }
        
        return answer;
    }
}