class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long root = (long)Math.sqrt(n);
        if(root*root != n) {
            answer = -1;
        } else {
            root++;
            answer = root*root; 
        }
        
        return answer;
    }
}