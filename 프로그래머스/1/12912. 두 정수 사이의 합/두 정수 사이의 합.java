class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int low, high;
        
        if(a>=b){
            high = a;
            low = b;
        } else {
            high = b;
            low = a;
        }
        
        for(int i = low ; i<=high; i++){
            answer+=i;
        }
        
        return answer;
    }
}