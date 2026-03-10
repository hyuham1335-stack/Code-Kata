import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        if(k <= score.length){
            for(int i=0;i<k;i++){
            pq.offer(score[i]);
            answer[i] = pq.peek();
        }
        
        for(int i=k; i<score.length; i++){
            if(pq.peek() < score[i]){
                pq.offer(score[i]);
                pq.poll();
                answer[i] = pq.peek();
        
            } else {
                answer[i] = pq.peek();
            }
        }
        } else {
            for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
            answer[i] = pq.peek();
        }
        }
        
        
        return answer;
    }
}